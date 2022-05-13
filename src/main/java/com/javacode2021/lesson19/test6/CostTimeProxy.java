package com.javacode2021.lesson19.test6;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/12 21:06
 **/
public class CostTimeProxy implements MethodInterceptor {
    /** 目标对象 */
    private Object target;

    public CostTimeProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long starTime = System.nanoTime();
        /** 调用被代理对象（即target）的方法,获取结果 */
        Object result = method.invoke(target, objects); //@1
        long endTime = System.nanoTime();
        System.out.println(method + ",耗时(纳秒):" + (endTime - starTime));
        return result;
    }

    /**
     * 创建任意类的代理对象
     * @Author guanqing
     * @Date 2022/5/13 9:08
     **/
    public static <T> T createProxy(T target){
        CostTimeProxy costTimeProxy = new CostTimeProxy(target);
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(costTimeProxy);
        return (T) enhancer.create();
    }
}
