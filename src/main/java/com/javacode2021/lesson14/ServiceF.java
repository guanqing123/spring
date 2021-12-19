package com.javacode2021.lesson14;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/19 10:51
 **/
public class ServiceF {

    public void say(){
        ServiceE serviceE = this.getServiceE();
        System.out.println("this:" + this + ",serviceE:" + serviceE);
    }

    public ServiceE getServiceE() { //@1
        return null;
    }
}
