package com.javacode2021.lesson21.test4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 16:30
 **/
@Component
public class Service3 {

    @Autowired
    private Service2 service2;//@1

    @Autowired
    private Service1 service1;//@1

    @Override
    public String toString() {
        return "Service3{" +
                "service2=" + service2 +
                ", service1=" + service1 +
                '}';
    }
}
