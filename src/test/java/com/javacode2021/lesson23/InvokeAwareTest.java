package com.javacode2021.lesson23;

import com.javacode2021.lesson23.demo6.AwareBean;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/22 21:10
 **/
public class InvokeAwareTest {

    @Test
    public void test1(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("awareBean", BeanDefinitionBuilder
                .genericBeanDefinition(AwareBean.class)
                .getBeanDefinition());
        /** 调用getBean方法获取bean,将触发bean的初始化 */
        factory.getBean("awareBean");
    }
}
