package com.javacode2021.lesson20.test3;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 18:02
 **/
public class OnMissingBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        /** 获取bean工厂 */
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        /** 从容器中获取IService类型的bean */
        Map<String, IService> serviceMap = beanFactory.getBeansOfType(IService.class);
        /** 判断serviceMap是否为空 */
        return serviceMap.isEmpty();
    }
}
