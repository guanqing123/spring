package com.javacode2021.lesson30;

import com.javacode2021.lesson30.demo1.CostTimeInvocationHandler;
import com.javacode2021.lesson30.demo1.IService1;
import com.javacode2021.lesson30.demo1.IService2;
import com.javacode2021.lesson30.demo1.Service;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/7/24 21:22
 **/
public class ProxyTest {

    @Test
    public void jdkTest(){
        Service target = new Service();
        CostTimeInvocationHandler costTimeInvocationHandler = new CostTimeInvocationHandler(target);
        /** 创建代理对象 */
        Object proxyObject = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                new Class[]{IService1.class, IService2.class}, /** 创建的代理对象实现了2个接口 */
                costTimeInvocationHandler);
        /** 判断代理对象是否是Service类型的,肯定是false咯 */
        System.out.println(String.format("proxyObject instanceof Service = %s", proxyObject instanceof Service));
        /** 判断代理对象是否是IService1类型的，肯定是true */
        System.out.println(String.format("proxyObject instanceof IService1 = %s", proxyObject instanceof IService1));
        /** 判断代理对象是否是IService2类型的，肯定是true */
        System.out.println(String.format("proxyObject instanceof IService2 = %s", proxyObject instanceof IService2));

        /** 将代理转换为IService1类型 */
        IService1 service1 = (IService1) proxyObject;
        /** 调用IService1的m1方法 */
        service1.m1();
        /** 将代理转换为IService2类型 */
        IService2 service2 = (IService2) proxyObject;
        /** 调用IService2的m2方法 */
        service2.m2();
        /** 输出代理的类型 */
        System.out.println("代理对象的类型:" + proxyObject.getClass());
    }
}
