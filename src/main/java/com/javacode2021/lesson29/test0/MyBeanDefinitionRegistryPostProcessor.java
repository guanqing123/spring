package com.javacode2021.lesson29.test0;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/4/14 21:47
 **/
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        /** 定义一个字符串类型的bean */
        AbstractBeanDefinition userNameBdf = BeanDefinitionBuilder
                .genericBeanDefinition(String.class)
                .addConstructorArgValue("路人")
                .getBeanDefinition();
        /** 将userNameBdf注册到spring容器中 */
        registry.registerBeanDefinition("userName", userNameBdf);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
