package com.javacode2021.lesson26.demo3;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/6 17:51
 **/
@Configuration
public class MainConfig3 {

    @Bean
    public MessageSource messageSource(){
        return new MessageSourceFromDb();
    }
}
