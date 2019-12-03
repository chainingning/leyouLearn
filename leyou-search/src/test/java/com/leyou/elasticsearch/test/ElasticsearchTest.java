package com.leyou.elasticsearch.test;
import com.leyou.common.pojo.PageResult;
import com.leyou.item.bo.SpuBo;
import com.leyou.search.client.GoodsClient;
import com.leyou.search.pojo.Goods;
import com.leyou.search.repository.GoodsRepository;
import com.leyou.search.service.SearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName ElasticsearchTest
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/11/28
 * @Version V1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class ElasticsearchTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private SearchService searchService;

    @Autowired
    private GoodsClient goodsClient;

    @Test
    public void test() {
        this.elasticsearchTemplate.createIndex(Goods.class);
        this.elasticsearchTemplate.putMapping(Goods.class);

        Integer page = 1;
        Integer row = 100;

        do {
            //分页查询spu,获取分页结果集
            PageResult<SpuBo> result = this.goodsClient.querySpuByPage(null, null, page, row);
            //获取当前页的数据
            List<SpuBo> items = result.getItems();
            //处理List<SpuBo>==》List<Goods>
            List<Goods> goodsList = items.stream().map(spuBo -> {
                try {
                    return this.searchService.buildGoods(spuBo);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }).collect(Collectors.toList());

            //执行新增数据的方法
            this.goodsRepository.saveAll(goodsList);
            //每次循环给rows赋值，当rows小于100的时候，说明是最后一页了
            row = items.size();
            page++;
        } while (row == 100);
    }
}
