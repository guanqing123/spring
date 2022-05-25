package com.javacode2021.lesson23;

import com.javacode2021.lesson23.demo9.MainConfig;
import com.javacode2021.lesson23.demo9.MySmartInitializingSingleton;
import com.javacode2021.lesson23.demo9.Service1;
import com.javacode2021.lesson23.demo9.Service2;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/25 9:03
 **/
public class SmartInitializingSingletonTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig.class);
        System.out.println("开始启动容器!");
        context.refresh();
        System.out.println("容器启动完毕!");
    }

    @Test
    public void test2(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("service1", BeanDefinitionBuilder.genericBeanDefinition(Service1.class).getBeanDefinition());
        factory.registerBeanDefinition("service2", BeanDefinitionBuilder.genericBeanDefinition(Service2.class).getBeanDefinition());
        factory.registerBeanDefinition("mySmartInitializingSingleton", BeanDefinitionBuilder.genericBeanDefinition(MySmartInitializingSingleton.class).getBeanDefinition());
        System.out.println("准备触发所有单例bean初始化");
        /** 触发所有bean初始化，并且回调 SmartInitializingSingleton#afterSingletonsInstantiated 方法 */
        factory.preInstantiateSingletons();
    }
}
