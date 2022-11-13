package com.javacode2021.lesson6.ThreadScope;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/11/13 16:41
 **/
public class BeanScopeModel {
    public BeanScopeModel(String beanScope) {
        System.out.println(String.format("线程:%s,create BeanScopeModel, {sope=%s},{this=%s}", Thread.currentThread(), beanScope, this));
    }
}
