package com.javacode2021.lesson23.demo11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/26 8:56
 **/
@Configuration
public class MainConfig {

    @Bean(destroyMethod = "customDestroyMethod") //@1
    public ServiceA serviceA(){
        return new ServiceA();
    }
}
