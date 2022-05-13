package com.javacode2021.lesson19.test8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/13 12:30
 **/
@Configuration
public class Configuration2 {
    @Bean
    public String name2(){
        System.out.println("name2");
        return "name2";
    }
}
