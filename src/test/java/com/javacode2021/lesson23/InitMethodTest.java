package com.javacode2021.lesson23;

import com.javacode2021.lesson23.demo8.Service;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/24 21:25
 **/
public class InitMethodTest {

    @Test
    public void test1(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinition service = BeanDefinitionBuilder.genericBeanDefinition(Service.class)
                .setInitMethodName("init") //@1: 指定初始化方法
                .getBeanDefinition();
        factory.registerBeanDefinition("service", service);

        System.out.println(factory.getBean("service"));
    }
}
