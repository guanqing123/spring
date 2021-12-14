package com.javacode2021.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/14 23:13
 **/
public class IocUtils {
    public static ClassPathXmlApplicationContext context(String path) {
        return new ClassPathXmlApplicationContext(path);
    }
}
