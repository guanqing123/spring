package com.javacode2021.lesson26.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/6 16:57
 **/
@Configuration
public class MainConfig1 {
    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource result = new ResourceBundleMessageSource();
        /** 可以指定国际化化配置文件的位置，格式：路径/文件名称,注意不包含【语言_国家.properties】含这部分 */
        result.setBasenames("com/javacode2021/lesson26/message");
        return result;
    }
}
