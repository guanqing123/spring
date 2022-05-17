package com.javacode2021.lesson23.demo2;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/17 21:20
 **/
public class Service2 {

    @Autowired
    private Service1 service1; //@1

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
