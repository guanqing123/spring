package com.javacode2021.lesson19.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/1/7 8:52
 **/
@Configuration
public class ConfigModule1 {
    @Bean
    public String module1(){
        return "我是模块1配置类";
    }
}
