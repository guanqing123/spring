package com.javacode2021.lesson20.test3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 18:05
 **/
@Configuration
public class BeanConfig1 {
    // @Conditional(OnMissingBeanCondition.class)
    @Bean
    public static IService service1(){ return new Service1(); }
}
