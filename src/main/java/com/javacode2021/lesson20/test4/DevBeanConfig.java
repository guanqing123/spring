package com.javacode2021.lesson20.test4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 19:37
 **/
@Configuration
@EnvConditional(EnvConditional.Env.DEV) //@1
public class DevBeanConfig {
    @Bean
    public String name(){
        return "我是开发环境";
    }
}
