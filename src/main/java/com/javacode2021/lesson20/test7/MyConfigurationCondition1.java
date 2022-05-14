package com.javacode2021.lesson20.test7;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 21:22
 **/
public class MyConfigurationCondition1 implements ConfigurationCondition {
    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.REGISTER_BEAN;
    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        Map<String, Service> beansOfType = beanFactory.getBeansOfType(Service.class);
        return !beansOfType.isEmpty();
    }
}
