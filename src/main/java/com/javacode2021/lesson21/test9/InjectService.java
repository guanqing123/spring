package com.javacode2021.lesson21.test9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 20:08
 **/
@Component
public class InjectService {

    @Autowired
    @Qualifier("service2") //@1
    private IService service;

    @Override
    public String toString() {
        return "InjectService{" +
                "service=" + service +
                '}';
    }
}
