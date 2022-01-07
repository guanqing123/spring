package com.javacode2021.lesson19.test2;

import org.springframework.context.annotation.Import;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/1/7 8:54
 **/
@Import({ConfigModule1.class, ConfigModule2.class}) //@1
public class MainConfig2 {
}
