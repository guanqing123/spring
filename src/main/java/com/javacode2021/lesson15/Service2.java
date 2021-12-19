package com.javacode2021.lesson15;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/19 20:28
 **/
public class Service2 {
    public void m1(){
        System.out.println("我是m1方法");
        this.m2(); //@1
    }

    public void m2(){
        System.out.println("我是m2方法");
    }
}
