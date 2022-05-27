package com.javacode2021.lesson23.demo10;

import javax.annotation.PreDestroy;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/26 8:37
 **/
public class ServiceB {
    public ServiceB() {
        System.out.println("create " + this.getClass());
    }

    @PreDestroy
    public void preDestroy(){ //@1
        System.out.println("preDestroy()");
    }
}
