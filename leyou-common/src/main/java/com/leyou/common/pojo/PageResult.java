package com.leyou.common.pojo;

import java.util.List;

/**
 * @ClassName PageResult
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/6
 * @Version V1.0
 **/
public class PageResult<T> {
    private Long tatal;
    private Integer totalPage;
    private List<T> items;

    public PageResult(Long tatal, List<T> items) {
        this.tatal = tatal;
        this.items = items;
    }

    public PageResult(Long tatal, Integer totalPage, List<T> items) {
        this.tatal = tatal;
        this.totalPage = totalPage;
        this.items = items;
    }

    public Long getTatal() {
        return tatal;
    }

    public void setTatal(Long tatal) {
        this.tatal = tatal;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
