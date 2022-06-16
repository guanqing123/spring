package com.javacode2021.lesson29.test2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/13 9:14
 **/
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("准备修改lessonModel bean定义信息!");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("lessonModel");
        beanDefinition.getPropertyValues().add("name", "spring高手系列！");
    }
}
