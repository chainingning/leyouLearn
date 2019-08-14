package cn.chai.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName TestApplication
 * @Description: 引导类，springboot应用的入口
 * @Author ningning.chai
 * @Date 2019/8/7
 * @Version V1.0
 **/
//@EnableAutoConfiguration
//类似于<context:component-scan base-packet="">扫描该类所在的包以及他的所有子包
//@ComponentScan
//使用组合注解，相当于@EnableAutoConfiguration ComponentScan SpringBootConfiguration
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
