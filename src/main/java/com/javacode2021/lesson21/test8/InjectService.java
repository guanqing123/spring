package com.javacode2021.lesson21.test8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 19:53
 **/
@Component
public class InjectService {

    @Autowired
    @Qualifier("tag1") //@1
    private Map<String, IService> serviceMap1;

    @Autowired
    @Qualifier("tag2") //@2
    private Map<String, IService> serviceMap2;

    @Override
    public String toString() {
        return "InjectService{" +
                "serviceMap1=" + serviceMap1 +
                ", serviceMap2=" + serviceMap2 +
                '}';
    }
}
