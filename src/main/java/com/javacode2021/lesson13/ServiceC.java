package com.javacode2021.lesson13;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/18 21:36
 **/
public class ServiceC {
    private String name;
    private ServiceA serviceA;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceA getServiceA() {
        return serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public String toString() {
        return "ServiceC{" +
                "name='" + name + "'" +
                ", serviceA=" + serviceA +
                "}";
    }
}
