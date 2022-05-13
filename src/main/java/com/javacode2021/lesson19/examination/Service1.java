package com.javacode2021.lesson19.examination;

import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/13 9:59
 **/
@Component
public class Service1 {
    public void m1(){
        System.out.println(this.getClass() + " m1()方法");
    }
}
