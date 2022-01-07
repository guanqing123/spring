package com.javacode2021.lesson19.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/1/7 8:54
 **/
@Configuration
public class ConfigModule2 {
    @Bean
    public String module2(){
        return "我是模块2配置类";
    }
}
