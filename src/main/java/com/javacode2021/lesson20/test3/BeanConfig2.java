package com.javacode2021.lesson20.test3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 18:06
 **/
@Configuration
public class BeanConfig2 {
    // @Conditional(OnMissingBeanCondition.class)
    @Bean
    public IService service2(){
        return new Service2();
    }
}
