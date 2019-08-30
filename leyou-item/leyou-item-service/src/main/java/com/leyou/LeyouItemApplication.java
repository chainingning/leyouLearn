package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName LeyouItemApplication
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/30
 * @Version V1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class LeyouItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouItemApplication.class);
    }
}
