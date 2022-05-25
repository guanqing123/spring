package com.javacode2021.lesson23.demo9;

import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/25 8:59
 **/
@Component
public class Service1 {

    public Service1() {
        System.out.println("create " + this.getClass());
    }
}
