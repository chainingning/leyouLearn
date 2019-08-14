package cn.chai.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @ClassName JdbcConfiguration
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/8/7
 * @Version V1.0
 **/
//声明一个类是一个java配置类，相当于一个xml配置文件
@Configuration
//@PropertySource("classpath:jdbc.properties")
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

    @Autowired
    private JdbcProperties jdbcProperties;

//    public JdbcConfiguration(JdbcProperties jdbcProperties){
//        this.jdbcProperties = jdbcProperties;
//    }



//    public DataSource dataSource(JdbcProperties jdbcProperties) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        dataSource.setUrl(jdbcProperties.getUrl());
//        dataSource.setUsername(jdbcProperties.getUsername());
//        dataSource.setPassword(jdbcProperties.getPassword());
//        return dataSource;
//    }
    @Bean
    @ConfigurationProperties(prefix="jdbc")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
