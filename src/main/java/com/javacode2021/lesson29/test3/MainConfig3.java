package com.javacode2021.lesson29.test3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/13 9:35
 **/
@Configuration
@ComponentScan
public class MainConfig3 {
    @Bean
    public UserModel user1(){
        return new UserModel();
    }

    @Bean
    public UserModel user2(){
        return new UserModel();
    }

    @Bean
    public String name(){
        return "路人甲Java,带大家成为java高手!";
    }
}
