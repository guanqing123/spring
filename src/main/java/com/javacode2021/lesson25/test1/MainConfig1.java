package com.javacode2021.lesson25.test1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/30 8:52
 **/
@Configuration
@ComponentScan
@PropertySource({"classpath:db.properties"})
public class MainConfig1 {
}
