package com.javacode2021.lesson21.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 15:53
 **/
@Component
public class Service2 {
    private Service1 service1;

    @Autowired
    public void setService1(Service1 service1) { //@1
        System.out.println(this.getClass().getName() + ".setService1方法");
        this.service1 = service1;
    }

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
