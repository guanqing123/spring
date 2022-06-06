package com.javacode2021.lesson26.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/6 17:42
 **/
@Configuration
public class MainConfig2 {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
       ReloadableResourceBundleMessageSource result = new ReloadableResourceBundleMessageSource();
       result.setBasenames("com/javacode2021/lesson26/message");
       /** 设置缓存时间1000毫秒 */
       result.setCacheMillis(1000);
       return result;
    }
}
