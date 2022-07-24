package com.javacode2021.lesson30.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/7/24 21:18
 **/
public class CostTimeInvocationHandler implements InvocationHandler {

    private Object target;

    public CostTimeInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startime = System.nanoTime();
        Object result = method.invoke(this.target, args); //将请求转发给target去处理
        System.out.println(method + ",耗时(纳秒):" + (System.nanoTime() - startime));
        return result;
    }
}
