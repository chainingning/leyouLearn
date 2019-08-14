package cn.chai.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.chai.service.mapper")//Mapper接口的包扫描
@EnableDiscoveryClient // 开启EurekaClient功能
public class ChaiServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaiServiceProviderApplication.class, args);
    }

}
