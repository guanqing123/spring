package com.javacode2021.lesson23;

import com.javacode2021.lesson23.demo4.MySmartInstantiationAwareBeanPostProcessor;
import com.javacode2021.lesson23.demo4.Person;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/21 21:34
 **/
public class SmartInstantiationAwareBeanPostProcessorTest {

    @Test
    public void test(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        /** 创建一个SmartInstantiationAwareBeanPostProcessor,将其添加到容器中 */
        factory.addBeanPostProcessor(new MySmartInstantiationAwareBeanPostProcessor());

        factory.registerBeanDefinition("name",
                BeanDefinitionBuilder
                        .genericBeanDefinition(String.class)
                        .addConstructorArgValue("路人甲Java")
                        .getBeanDefinition());

        factory.registerBeanDefinition("age",
                BeanDefinitionBuilder
                        .genericBeanDefinition(Integer.class)
                        .addConstructorArgValue(30)
                        .getBeanDefinition());

        factory.registerBeanDefinition("person",
                BeanDefinitionBuilder
                        .genericBeanDefinition(Person.class)
                        .getBeanDefinition());

        Person person = factory.getBean("person", Person.class);
        System.out.println(person);
    }

}
