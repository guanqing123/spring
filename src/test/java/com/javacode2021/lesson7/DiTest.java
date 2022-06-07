package com.javacode2021.lesson7;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 9:26
 **/
public class DiTest {

    @Test
    public void diByConstructorParamName(){
        String xml = "com/javacode2021/lesson7/diByConstructorParamName.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xml);
        System.out.println(context.getBean("diByConstructorParamName"));
    }

    @Test
    public void diByConstructorProperties(){
        String xml = "com/javacode2021/lesson7/diByConstructorParamName.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xml);
        System.out.println(context.getBean("diByConstructorProperties"));
    }

    @Test
    public void diByOtherType(){
        String xml = "classpath:/com/javacode2021/lesson7/diOtherType.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xml);
        System.out.println(context.getBean("diOtherTypeModel"));
    }
}
