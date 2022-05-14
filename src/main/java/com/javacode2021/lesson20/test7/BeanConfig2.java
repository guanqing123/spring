package com.javacode2021.lesson20.test7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 21:17
 **/
@Configuration
@Conditional(MyCondition1.class)
public class BeanConfig2 {
    @Bean
    public String name(){
        return "路人甲Java";
    }
}
