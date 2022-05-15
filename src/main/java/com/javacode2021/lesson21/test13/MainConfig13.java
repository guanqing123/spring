package com.javacode2021.lesson21.test13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 20:56
 **/
@Configuration
public class MainConfig13 {

    @Bean
    public IService service1(){
        return new Service1();
    }

    @Bean
    @Primary //@1
    public IService service2(){
        return new Service2();
    }

    @Bean
    public InjectService injectService(){
        return new InjectService();
    }
}
