package com.javacode2021.lesson19.test4;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/4/25 9:15
 **/
public class Service2 {
    private Service1 service1;

    public Service1 getService1() {
        return service1;
    }

    public void setService1(Service1 service1) {
        this.service1 = service1;
    }

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
