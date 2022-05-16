package com.javacode2021.lesson22.test2;

import com.javacode2021.lesson22.test1.Service1;
import com.javacode2021.lesson22.test1.Service2;
import com.javacode2021.lesson22.test1.Service3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 9:05
 **/
@Configuration
public class MainConfig2 {

    @Bean
    @DependsOn({"service2", "service3"})//@1
    public Service1 service1(){
        return new Service1();
    }

    @Bean
    public Service2 service2(){
        return new Service2();
    }

    @Bean
    public Service3 service3(){
        return new Service3();
    }
}
