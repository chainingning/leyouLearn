package cn.chai.springboot.controller;

import cn.chai.springboot.config.JdbcConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description: xx
 * @Author ningning.chai
 * @Date 2019/8/7
 * @Version V1.0
 **/
@RequestMapping("hello")
//启用自动配置
@EnableAutoConfiguration
@RestController
public class HelloController {

    @Autowired
    private JdbcConfiguration jdbcConfiguration;

    @GetMapping("show")
    public String test(){
        return "hello springboot";
    }
}
