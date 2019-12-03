package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @ClassName GoodsRepository
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/11/28
 * @Version V1.0
 **/
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}