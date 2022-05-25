package com.javacode2021.lesson23;

import com.javacode2021.lesson23.demo10.MyDestructionAwareBeanPostProcessor;
import com.javacode2021.lesson23.demo10.ServiceA;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/25 9:21
 **/
public class DestructionAwareBeanPostProcessorTest {

    @Test
    public void test1(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        /** 添加自定义的DestructionAwareBeanPostProcessor */
        factory.addBeanPostProcessor(new MyDestructionAwareBeanPostProcessor());

        /** 向容器中注入3个单例bean */
        factory.registerBeanDefinition("serviceA1", BeanDefinitionBuilder.genericBeanDefinition(ServiceA.class).getBeanDefinition());
        factory.registerBeanDefinition("serviceA2", BeanDefinitionBuilder.genericBeanDefinition(ServiceA.class).getBeanDefinition());
        factory.registerBeanDefinition("serviceA3", BeanDefinitionBuilder.genericBeanDefinition(ServiceA.class).getBeanDefinition());

        /** 触发所有单例bean初始化 */
        factory.preInstantiateSingletons();

        System.out.println("销毁serviceA1");
        /** 销毁指定的bean */
        factory.destroySingleton("serviceA1");//@1

        System.out.println("触发所有单例bean的销毁");
        factory.destroySingletons();//@2
    }
}
