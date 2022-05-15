package com.javacode2021.lesson21.test0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 12:14
 **/
@Component
public class Service2 {
    private Service1 service1;

    public Service2() { //@1
        System.out.println(this.getClass() + "无参构造器");
    }

    @Autowired
    public Service2(Service1 service1) { //@2
        System.out.println(this.getClass() + "有参构造器");
        this.service1 = service1;
    }

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
