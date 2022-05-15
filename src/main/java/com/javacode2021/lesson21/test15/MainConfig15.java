package com.javacode2021.lesson21.test15;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 21:18
 **/
@Configuration
public class MainConfig15 {
    @Bean
    public Service1 service1(){
        return new Service1();
    }

    @Bean
    public Service2 service2(){
        return new Service2();
    }

    @Bean
    public Service3 service3(Service1 s1, Service2 s2) { //@0
        Service3 service3 = new Service3();
        service3.setService1(s1);
        service3.setService2(s2);
        return service3;
    }
}
