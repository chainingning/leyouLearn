package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName LeyouResgistryApplication
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/29
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class LeyouResgistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouResgistryApplication.class);
    }
}
