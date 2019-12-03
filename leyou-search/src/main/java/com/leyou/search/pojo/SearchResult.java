package com.leyou.search.pojo;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SearchResult
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/12/3
 * @Version V1.0
 **/
public class SearchResult extends PageResult<Goods> {

    private List<Map<String,Object>> categories;
    private List<Brand> brands;

    public SearchResult() {
    }

    public SearchResult(Long tatal, List<Goods> items, List<Map<String, Object>> categories, List<Brand> brands) {
        super(tatal, items);
        this.categories = categories;
        this.brands = brands;
    }

    public SearchResult(Long tatal, Integer totalPage, List<Goods> items, List<Map<String, Object>> categories, List<Brand> brands) {
        super(tatal, totalPage, items);
        this.categories = categories;
        this.brands = brands;
    }

    public SearchResult(List<Map<String, Object>> categories, List<Brand> brands) {
        this.categories = categories;
        this.brands = brands;
    }



    public void setCategories(List<Map<String, Object>> categories) {
        this.categories = categories;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }
}
