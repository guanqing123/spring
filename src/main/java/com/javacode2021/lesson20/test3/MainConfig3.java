package com.javacode2021.lesson20.test3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 18:07
 **/
@Configuration
@Import({BeanConfig1.class, BeanConfig2.class}) //@1
public class MainConfig3 {
}
