package com.javacode2021.lesson14;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/19 12:02
 **/
public class ServiceH {

    public void say() {
        ServiceG serviceG = this.getServiceG();
        System.out.println("this:" + this + ",serviceG:" + serviceG);
    }

    public ServiceG getServiceG() { //@1
        return null;
    }
}
