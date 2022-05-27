package com.javacode2021.lesson24.module1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/27 8:28
 **/
@Component
public class Service2 {

    @Autowired
    private com.javacode2021.lesson24.module1.Service1 service1; //@1

    public String m1(){ //@2
        return this.service1.m1();
    }
}
