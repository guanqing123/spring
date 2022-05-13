package com.javacode2021.lesson19.test6;

import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/12 21:05
 **/
@Component
public class Service2 {
    public void m1(){
        System.out.println(this.getClass() + ".m1()");
    }
}
