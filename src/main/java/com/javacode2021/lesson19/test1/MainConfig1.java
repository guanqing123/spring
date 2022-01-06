package com.javacode2021.lesson19.test1;

import org.springframework.context.annotation.Import;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/1/6 9:02
 **/
@Import({Service1.class, Service2.class})
public class MainConfig1 {
}
