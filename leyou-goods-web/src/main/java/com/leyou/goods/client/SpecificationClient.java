package com.leyou.goods.client;

import com.leyou.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @InterfaceName SpecificationClient
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/11/27
 * @Version V1.0
 **/
@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {
}
