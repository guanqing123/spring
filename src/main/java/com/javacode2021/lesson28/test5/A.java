package com.javacode2021.lesson28.test5;

import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/14 21:50
 **/
@Component
public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }
}
