package com.javacode2021.lesson17;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/28 12:15
 **/
public class ServiceB {
    private ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public String toString() {
        return "ServiceB{" +
                "serviceA=" + serviceA +
                '}';
    }
}
