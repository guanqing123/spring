package com.javacode2021.lesson15.test;

import com.javacode2021.lesson15.IService;
import com.javacode2021.lesson15.ServiceA;
import com.javacode2021.lesson15.ServiceB;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 11:01
 **/
public class CostTimeProxy implements InvocationHandler, MethodInterceptor {

    private Object target;

    public CostTimeProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starTime = System.nanoTime();
        Object result = method.invoke(this.target, args);
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass() +"."+ method.getName() + "方法耗时(纳秒):" + (endTime - starTime));
        return result;
    }

    public static <T> T createProxy(Object target, Class<T> targetInterface) {
        if (!targetInterface.isInterface()) {
            throw new IllegalStateException("targetInterface必须是接口类型");
        } else if (!targetInterface.isAssignableFrom(target.getClass())) {
            throw new IllegalStateException("target必须是targetInterface接口的实现类!");
        }

        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new CostTimeProxy(target));
        // return (T) Proxy.newProxyInstance(targetInterface.getClassLoader(), new Class[]{targetInterface}, new CostTimeProxy(target));
    }

    public static void main(String[] args) {
        // IService service = CostTimeProxy.createProxy(new ServiceA(), IService.class);
        // service.m1();

        IService service1 = CostTimeProxy.createCglibProxy(new ServiceB());
        service1.m1();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long starTime = System.nanoTime();
        // Object result = methodProxy.invokeSuper(o, objects);
        Object result = method.invoke(this.target, objects);
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass() + "." + method.getName() + "方法耗时(纳秒):" + (endTime - starTime));
        return result;
    }

    public static <T> T createCglibProxy(T target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CostTimeProxy(target));
        return (T) enhancer.create();
    }
}
