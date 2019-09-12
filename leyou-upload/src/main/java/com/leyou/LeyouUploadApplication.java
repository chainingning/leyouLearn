package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName LeyouUploadApplication
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/12
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class LeyouUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouUploadApplication.class, args);
    }
}
