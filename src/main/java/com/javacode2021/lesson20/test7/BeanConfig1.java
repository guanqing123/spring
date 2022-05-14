package com.javacode2021.lesson20.test7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 21:16
 **/
@Configuration
public class BeanConfig1 {
    @Bean
    public Service service(){
        return new Service();
    }
}
