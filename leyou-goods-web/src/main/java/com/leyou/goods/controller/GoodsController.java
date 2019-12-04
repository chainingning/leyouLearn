package com.leyou.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName GoodsController
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/12/4
 * @Version V1.0
 **/
@Controller
public class GoodsController {

    @GetMapping("item/{spuId}.html")
    public String toItemPage(@PathVariable("spuId")Long id, Model model){


        return "item";
    }
}
