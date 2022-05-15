package com.javacode2021.lesson21.test13;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 20:55
 **/
public class InjectService {

    @Autowired
    private IService service1; //@1

    @Override
    public String toString() {
        return "InjectService{" +
                "service1=" + service1 +
                '}';
    }
}
