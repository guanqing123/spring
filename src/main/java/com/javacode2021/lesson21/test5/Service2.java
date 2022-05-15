package com.javacode2021.lesson21.test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 16:39
 **/
@Component
public class Service2 {
    @Autowired
    private IService service1; //@1

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
