package com.leyou.item.api;

import com.leyou.item.pojo.Brand;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName BrandController
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/6
 * @Version V1.0
 **/
@RequestMapping("brand")
public interface BrandApi {

    @GetMapping("{id}")
    public Brand queryBrandById(@PathVariable("id")Long id);


}
