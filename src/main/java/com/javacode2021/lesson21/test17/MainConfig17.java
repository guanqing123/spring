package com.javacode2021.lesson21.test17;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 21:25
 **/
@Configuration
public class MainConfig17 {

    @Bean
    @Qualifier("tag1") //@1
    public Service1 service1(){
        return new Service1();
    }

    @Bean
    @Qualifier("tag1") //@2
    public Service2 service2(){
        return new Service2();
    }

    @Bean
    @Qualifier("tag2") //@3
    public Service3 service3(){
        return new Service3();
    }

    @Bean
    public InjectService injectService(@Qualifier("tag1")Map<String, IService> map1) { //@4
        InjectService injectService = new InjectService();
        injectService.setServiceMap1(map1);
        return injectService;
    }
}
