package com.javacode2021.lesson12;

import com.javacode2021.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/18 19:45
 **/
public class LazyBeanTest {

    @Test
    public void actualTimeBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/javacode2021/lesson12/actualTimeBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("spring容器启动完毕...");
    }

    @Test
    public void lazyInitBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/javacode2021/lesson12/lazyInitBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("spring容器启动完毕...");
        System.out.println("从容器中开始查找LazyInitBean");
        LazyInitBean lazyInitBean = context.getBean(LazyInitBean.class);
        System.out.println("LazyInitBean:" + lazyInitBean);
    }

    @Test
    public void actualTimeDependencyLazyBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/javacode2021/lesson12/actualTimeDependencyLazyBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("spring容器启动完毕...");
    }
}
