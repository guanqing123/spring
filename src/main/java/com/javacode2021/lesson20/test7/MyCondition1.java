package com.javacode2021.lesson20.test7;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 21:20
 **/
public class MyCondition1 implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        /** 获取spring容器 */
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        /** 判断容器中是否存在Service类型的bean */
        Map<String, Service> beansOfType = beanFactory.getBeansOfType(Service.class);
        return !beansOfType.isEmpty();
    }
}
