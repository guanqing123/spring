package com.javacode2021.lesson15;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/20 9:04
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
        // Object result = methodProxy.invokeSuper(o, objects); 发现这样也可以
        long endTime = System.nanoTime();
        System.out.println(method + ",耗时(纳秒):" + (endTime - starTime));
        return result;
    }

    /**
     * 创建任意类的代理对象
     * @Author guanqing
     * @Date 2021/12/20 9:08
     **/
    public static <T> T createProxy(T target) {
        CostTimeProxy costTimeProxy = new CostTimeProxy(target);
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(costTimeProxy);
        enhancer.setSuperclass(target.getClass());
        return (T) enhancer.create();
    }
}
