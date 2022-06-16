package com.javacode2021.lesson28.test5;

import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/14 21:51
 **/
@Component
public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }
}
