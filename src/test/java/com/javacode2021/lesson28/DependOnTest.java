package com.javacode2021.lesson28;

import com.javacode2021.lesson28.test1.MainConfig1;
import com.javacode2021.lesson28.test3.MainConfig3;
import com.javacode2021.lesson28.test3.Service1;
import com.javacode2021.lesson28.test3.Service2;
import com.javacode2021.lesson28.test4.MainConfig4;
import com.javacode2021.lesson28.test5.MainConfig5;
import com.javacode2021.lesson28.test6.MainConfig6;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/8 9:00
 **/
public class DependOnTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig1.class);
        context.refresh();
    }

    @Test
    public void test2(){
        String xml = "com/javacode2021/lesson28/test2/dependency.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xml);
        context.refresh();
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig3.class);
        context.refresh();
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        /** 创建一个BeanFactoryPostProcessor：BeanFactory后置处理器 */
        context.addBeanFactoryPostProcessor(beanFactory -> {
            if (beanFactory instanceof DefaultListableBeanFactory) {
                /** allowRawInjectionDespiteWrapping设置为true */
                ((DefaultListableBeanFactory) beanFactory).setAllowRawInjectionDespiteWrapping(true);
            }
        });
        context.register(MainConfig3.class);
        context.refresh();

        /** 获取service1 */
        Service1 service1 = context.getBean(Service1.class);
        /** 获取service2 */
        Service2 service2 = context.getBean(Service2.class);

        System.out.println("-----A-----");
        service2.m1(); //@1
        System.out.println("-----B-----");
        service1.m1(); //@2
        System.out.println("-----C-----");
        System.out.println(service2.getService1() == service1);

        System.out.println("容器初始化完毕");
    }

    @Test
    public void test5(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("容器初始化完毕");

        /** 获取service1 */
        com.javacode2021.lesson28.test4.Service1 service1 = context.getBean(com.javacode2021.lesson28.test4.Service1.class);
        /** 获取service2 */
        com.javacode2021.lesson28.test4.Service2 service2 = context.getBean(com.javacode2021.lesson28.test4.Service2.class);
        System.out.println("----A-----");
        service2.m1(); //@1
        System.out.println("----B-----");
        service1.m1(); //@2
        System.out.println("----C-----");
        System.out.println(service2.getService1() == service1);
    }

    @Test
    public void test6(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig5.class);
        context.refresh();
    }

    @Test
    public void test7(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig6.class);
        context.refresh();
    }
}
