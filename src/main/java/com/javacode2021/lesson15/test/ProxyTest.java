package com.javacode2021.lesson15.test;

import com.javacode2021.lesson15.IService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 11:08
 **/
public class ProxyTest {

    public void jdkProxy() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<IService> proxyClass = (Class<IService>) Proxy.getProxyClass(IService.class.getClassLoader(), IService.class);

        IService service = proxyClass.getConstructor(InvocationHandler.class).newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });

        service.m3();
    }

    public void jdkProxy2(){
        IService service = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(), new Class[]{IService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });

        service.m3();
    }

}
