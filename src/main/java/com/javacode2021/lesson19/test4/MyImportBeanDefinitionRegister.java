package com.javacode2021.lesson19.test4;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/4/25 9:18
 **/
public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        /** 定义一个bean: Service1 */
        BeanDefinition service1BeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Service1.class).getBeanDefinition();
        /** 注册bean */
        registry.registerBeanDefinition("service1", service1BeanDefinition);

        /** 定义一个bean: Service2, 通过addPropertyReference注入service1 */
        BeanDefinition service2BeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Service2.class)
                .addPropertyReference("service1", "service1")
                .getBeanDefinition();
        /** 注册bean */
        registry.registerBeanDefinition("service2", service2BeanDefinition);
    }
}
