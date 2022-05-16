package com.javacode2021.lesson22.test5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 17:23
 **/
@Configuration
@Lazy //@1
public class MainConfig5 {

    @Bean
    public String name(){
        System.out.println("create bean:name");
        return "路人甲Java";
    }

    @Bean
    public String address(){
        System.out.println("create bean:address");
        return "上海市";
    }

    @Bean
    @Lazy(false) //@2
    public Integer age(){
        System.out.println("create bean:age");
        return 30;
    }
}
