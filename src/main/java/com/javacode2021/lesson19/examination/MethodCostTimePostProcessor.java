package com.javacode2021.lesson19.examination;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/13 10:02
 **/
public class MethodCostTimePostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().getName().toLowerCase().contains("service")){
            return CostTimeProxy.createProxy(bean);
        } else {
            return bean;
        }
    }
}
