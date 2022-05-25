package com.javacode2021.lesson23;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/25 8:29
 **/
public class PostProcessAfterInitializationTest {

    @Test
    public void test1(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        /** 加入bean初始化后置处理器方法实现 */
        factory.addBeanPostProcessor(new BeanPostProcessor() {
            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                System.out.println("postProcessAfterInitialization: " + beanName);
                return bean;
            }
        });

        /** 下面注册2个String类型的bean */
        factory.registerBeanDefinition("name",
                BeanDefinitionBuilder
                        .genericBeanDefinition(String.class)
                        .addConstructorArgValue("公众号：【路人甲Java】")
                        .getBeanDefinition());
        factory.registerBeanDefinition("personInformation",
                BeanDefinitionBuilder
                        .genericBeanDefinition(String.class)
                        .addConstructorArgValue("带领大家成为java高手")
                        .getBeanDefinition());

        System.out.println("---------输出bean信息-----------");

        for (String beanName : factory.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, factory.getBean(beanName)));
        }
    }
}
