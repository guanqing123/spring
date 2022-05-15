package com.javacode2021.lesson21.test7;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 18:38
 **/
@Component
public class Service2 {

    @Resource
    private IService service0; //@1

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service0 +
                '}';
    }
}
