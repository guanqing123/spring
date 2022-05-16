package com.javacode2021.lesson22.test1;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 8:45
 **/
@DependsOn({"service2", "service3"}) //@1
@Component
public class Service1 {
    public Service1() {
        System.out.println("create Service1");
    }
}
