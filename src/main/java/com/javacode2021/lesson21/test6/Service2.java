package com.javacode2021.lesson21.test6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 16:56
 **/
@Component
public class Service2 {

    @Autowired
    private List<IService> services;

    @Autowired
    private Map<String, IService> serviceMap;

    @Override
    public String toString() {
        return "Service2{" +
                "services=" + services +
                ", serviceMap=" + serviceMap +
                '}';
    }
}
