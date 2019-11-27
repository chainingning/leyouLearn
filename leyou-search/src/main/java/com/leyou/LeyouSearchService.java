package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName LeyouSearchService
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/11/26
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class LeyouSearchService {
    public static void main(String[] args) {
        SpringApplication.run(LeyouSearchService.class);
    }
}
