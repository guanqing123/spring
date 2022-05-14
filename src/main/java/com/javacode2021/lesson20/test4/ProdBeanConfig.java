package com.javacode2021.lesson20.test4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 19:39
 **/
@Configuration
@EnvConditional(EnvConditional.Env.PROD) //@1
public class ProdBeanConfig {
    @Bean
    public String name(){
        return "我是生产环境";
    }
}
