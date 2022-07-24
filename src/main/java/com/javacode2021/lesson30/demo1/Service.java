package com.javacode2021.lesson30.demo1;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/7/24 21:16
 **/
public class Service implements IService1, IService2 {
    @Override
    public void m1() {
        System.out.println("我是m1");
    }

    @Override
    public void m2() {
        System.out.println("我是m2");
    }
}
