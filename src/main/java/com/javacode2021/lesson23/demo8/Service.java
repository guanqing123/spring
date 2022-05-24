package com.javacode2021.lesson23.demo8;

import org.springframework.beans.factory.InitializingBean;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/24 21:24
 **/
public class Service implements InitializingBean {

    public void init(){
        System.out.println("调用init()方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet()");
    }
}
