package com.javacode2021.lesson19.test5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/12 20:22
 **/
@Configuration
public class Module1Config {
    @Bean
    public String name(){
        return "公众号: 路人甲java";
    }

    @Bean
    public String address(){
        return "上海市";
    }
}
