package com.javacode2021.lesson24.module2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/27 8:33
 **/
@Component
public class Service3 {
    /** 使用模块2中的Service1 */
    @Autowired
    private com.javacode2021.lesson24.module2.Service1 service1; //@1
    /** 使用模块1中的Service2 */
    @Autowired
    private com.javacode2021.lesson24.module1.Service2 service2; //@2

    public String m1(){
        return this.service2.m1();
    }

    public String m2(){
        return this.service1.m2();
    }
}
