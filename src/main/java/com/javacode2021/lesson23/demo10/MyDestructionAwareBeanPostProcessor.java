package com.javacode2021.lesson23.demo10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/25 9:20
 **/
public class MyDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        System.out.println("准备销毁bean: " + beanName);
    }
}
