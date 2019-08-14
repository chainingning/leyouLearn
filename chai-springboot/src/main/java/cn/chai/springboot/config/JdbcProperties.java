package cn.chai.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName JdbcProperties
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/7
 * @Version V1.0
 **/
@ConfigurationProperties(prefix="jdbc")
@Data
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
