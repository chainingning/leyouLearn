package com.leyou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @ClassName LeyouCorsConfiguration
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/5
 * @Version V1.0
 **/
@Configuration
public class LeyouCorsConfiguration {

    @Bean
    public CorsFilter corsFilter(){
        //初始化cors配置对象
        CorsConfiguration configuration = new CorsConfiguration();
        //允許跨域的域名，如果要携带cookie，不能写*。*：代表所有的域名都可以跨域访问
        configuration.addAllowedOrigin("http://manage.leyou.com");
        configuration.setAllowCredentials(true);
        configuration.addAllowedMethod("*");//代表所有的请求方法
        configuration.addAllowedHeader("*");// 4）允许的头信息
        //初始化配置源对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",configuration);

        //返回corsFIlter实例，参数：cors配置对象
        return new CorsFilter(configurationSource);
    }
}
