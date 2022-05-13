package com.javacode2021.lesson19.examination;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Method;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/13 10:04
 **/
@EnableAspectJAutoProxy
public class CostTimeProxy implements MethodInterceptor {

    /** 代理对象 */
    private Object target;

    public CostTimeProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long startTime = System.nanoTime();
        Object result = method.invoke(target, objects);
        long endTime = System.nanoTime();
        System.out.println(method.getName() + "花费：" + (endTime - startTime) + " 纳秒");
        return result;
    }

    public static <T> T createProxy(T target) {
        CostTimeProxy proxy = new CostTimeProxy(target);
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(proxy);
        return (T) enhancer.create();
    }
}
