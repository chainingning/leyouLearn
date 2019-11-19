package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName CategoryMapper
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/5
 * @Version V1.0
 **/
public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category,Long> {
}
