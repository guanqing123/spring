package com.javacode2021.lesson20.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 16:24
 **/
@Conditional(MyCondition1.class) //@1
@Configuration
public class MainConfig1 {
    @Bean
    public String name(){ //@2
        return "路人甲Java";
    }
}
