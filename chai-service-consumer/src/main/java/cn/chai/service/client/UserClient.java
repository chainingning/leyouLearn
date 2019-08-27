package cn.chai.service.client;

import cn.chai.service.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName UserClient
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/27
 * @Version V1.0
 **/
//声明一个接口是feign接口，指定服务id
@FeignClient(value = "service-provider",fallback = UserClientsFallback.class)
public interface UserClient {
    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
