package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @ClassName BrandClient
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/11/27
 * @Version V1.0
 **/
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
