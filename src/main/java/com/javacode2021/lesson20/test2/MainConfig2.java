package com.javacode2021.lesson20.test2;

import com.javacode2021.lesson20.test1.MyCondition1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 16:52
 **/
@Configuration
public class MainConfig2 {
    @Conditional(MyCondition1.class) //@1
    @Bean
    public String name(){
        return "路人甲Java";
    }

    @Bean
    public String address(){
        return "上海市";
    }
}
