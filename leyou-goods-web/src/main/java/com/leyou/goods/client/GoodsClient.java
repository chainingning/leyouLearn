package com.leyou.goods.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @ClassName GoodsClient
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/11/27
 * @Version V1.0
 **/
@FeignClient("item-service")
public interface GoodsClient extends GoodsApi {

}
