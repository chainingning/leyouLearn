package com.leyou.item.bo;

import com.leyou.item.pojo.Spu;

/**
 * @ClassName SpuBo
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/26
 * @Version V1.0
 **/
public class SpuBo extends Spu {
    private String cname;

    private String bname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
