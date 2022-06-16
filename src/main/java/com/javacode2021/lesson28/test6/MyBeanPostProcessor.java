package com.javacode2021.lesson28.test6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/15 9:02
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("loginA")) {
            /** loginA实现了ILogin */
            return new LoginC((ILogin) bean);
        } else {
            return bean;
        }
    }
}
