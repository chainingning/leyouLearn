package com.leyou.item.api;


import com.leyou.item.pojo.SpecParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName SpecificationController
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/20
 * @Version V1.0
 **/
@RequestMapping("spec")
public interface SpecificationApi {

    /**
     * 根据gid查询规格参数,加上分页条件
     *
     * @param gid
     * @return
     */
    @GetMapping("params")
    public List<SpecParam> queryParams(
            @RequestParam(value = "gid", required = false) Long gid,
            @RequestParam(value = "cid", required = false) Long cid,
            @RequestParam(value = "generic", required = false) Boolean generic,
            @RequestParam(value = "searching", required = false) Boolean searching
    );
}
