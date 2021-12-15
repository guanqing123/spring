package com.javacode2021.lesson6;

import com.javacode2021.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/14 23:10
 **/
public class DiAutowireTest {

    @Test
    public void diAutowireByName () {
        String beanXml = "classpath:/com/javacode2021/lesson6/diAutowireByName.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByName1"));
        System.out.println(context.getBean("diAutowireByName2"));
    }

    @Test
    public void diAutowireByType () {
        String beanXml = "classpath:/com/javacode2021/lesson6/diAutowireByType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        // System.out.println(context.getBean("diAutowireByName1"));
        System.out.println(context.getBean("diAutowireByName2"));
    }

    @Test
    public void diAutowireByTypeExtend () {
        String beanXml = "classpath:/com/javacode2021/lesson6/diAutowireByTypeExtend.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        DiAutowireByTypeExtend diAutowireByTypeExtend = context.getBean(DiAutowireByTypeExtend.class);
        System.out.println("serviceList：" + diAutowireByTypeExtend.getServiceList());
        System.out.println("baseServiceList：" + diAutowireByTypeExtend.getBaseServiceList());
        System.out.println("service1Map：" + diAutowireByTypeExtend.getService1Map());
        System.out.println("baseServiceMap：" + diAutowireByTypeExtend.getBaseServiceMap());
    }

    @Test
    public void diAutowireByConstructor () {
        String beanXml = "classpath:/com/javacode2021/lesson6/diAutowireByConstructor.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByConstructor"));
    }

    @Test
    public void diAutowireByDefault () {
        String beanXml = "classpath:/com/javacode2021/lesson6/diAutowireByDefault.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByDefault1"));
        System.out.println(context.getBean("diAutowireByDefault2"));
    }
}
