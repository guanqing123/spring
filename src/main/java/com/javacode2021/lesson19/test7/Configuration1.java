package com.javacode2021.lesson19.test7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/13 11:24
 **/
@Configuration
public class Configuration1 {
    @Bean
    public String name1(){
        System.out.println("name1");
        return "name1";
    }
}
