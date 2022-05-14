package com.javacode2021.lesson20.test4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 19:40
 **/
@Configuration
@EnvConditional(EnvConditional.Env.TEST) //@1
public class TestBeanConfig {
    @Bean
    public String name(){
        return "我是测试环境";
    }
}
