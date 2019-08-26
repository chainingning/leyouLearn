package cn.chai.service.controller;

import cn.chai.service.pojo.User;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName UserController
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/13
 * @Version V1.0
 **/
@Controller
@RequestMapping("consumer/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    //包含所有的服务提供方信息
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping
    @ResponseBody
    @HystrixCommand(fallbackMethod = "queryUserByIdFallback")
    public String queryUserById(@RequestParam("id")Long id){
//        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
//        ServiceInstance serviceInstance = instances.get(0);

        return this.restTemplate.getForObject("http://service-provider/user/"+id,String.class);
    }

    public String queryUserByIdFallback(Long id){
        return "服务正忙，请稍后再试!";
    }
}
