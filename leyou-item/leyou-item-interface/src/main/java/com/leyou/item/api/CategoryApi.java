package com.leyou.item.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName CategoryController
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/5
 * @Version V1.0
 **/
@RequestMapping("category")
public interface CategoryApi {


    @GetMapping
    public List<String> queryNamesByIds(@RequestParam("ids")List<Long> ids);

}
