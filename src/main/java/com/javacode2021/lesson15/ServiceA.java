package com.javacode2021.lesson15;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/19 15:47
 **/
public class ServiceA implements IService {
    @Override
    public void m1() {
        System.out.println("我是ServiceA中的m1方法!");
    }

    @Override
    public void m2() {
        System.out.println("我是ServiceA中的m2方法!");
    }

    @Override
    public void m3() {
        System.out.println("我是ServiceA中的m3方法!");
    }
}
