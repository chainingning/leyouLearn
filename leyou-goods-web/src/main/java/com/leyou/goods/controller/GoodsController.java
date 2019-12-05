package com.leyou.goods.controller;

import com.leyou.goods.service.GoodsHtmlService;
import com.leyou.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @ClassName GoodsController
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/12/4
 * @Version V1.0
 **/
@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodsHtmlService goodsHtmlService;

    @GetMapping("item/{spuId}.html")
    public String toItemPage(@PathVariable("spuId")Long id, Model model){
        // 加载所需的数据
        Map<String, Object> modelMap = this.goodsService.loadData(id);
        // 放入模型
        model.addAllAttributes(modelMap);

        // 页面静态化
        this.goodsHtmlService.createHtml(id);

        return "item";
    }
}
