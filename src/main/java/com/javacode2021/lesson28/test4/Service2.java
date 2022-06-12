package com.javacode2021.lesson28.test4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/10 8:16
 **/
@Component
public class Service2 {
    public void m1(){
        System.out.println("Service2 m1");
        this.service1.m1(); //@1
    }

    private Service1 service1;

    public Service1 getService1() {
        return service1;
    }

    @Autowired
    public void setService1(Service1 service1) {
        this.service1 = service1;
    }
}
