package com.javacode2021.lesson20.test7;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 21:17
 **/
@Configuration
@Import({BeanConfig1.class, BeanConfig2.class})
public class MainConfig7 {
}
