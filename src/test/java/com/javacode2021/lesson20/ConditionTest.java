package com.javacode2021.lesson20;

import com.javacode2021.lesson20.test1.MainConfig1;
import com.javacode2021.lesson20.test2.MainConfig2;
import com.javacode2021.lesson20.test3.IService;
import com.javacode2021.lesson20.test3.MainConfig3;
import com.javacode2021.lesson20.test4.MainConfig4;
import com.javacode2021.lesson20.test5.MainConfig5;
import com.javacode2021.lesson20.test6.MainConfig6;
import com.javacode2021.lesson20.test7.MainConfig7;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 16:25
 **/
public class ConditionTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        Map<String, String> beansOfType = context.getBeansOfType(String.class);
        beansOfType.forEach((beanName, bean) -> {
            System.out.println(String.format("%s -> %s", beanName, bean));
        });
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        Map<String, String> beansOfType = context.getBeansOfType(String.class);
        beansOfType.forEach((beanName, bean) -> {
            System.out.println(String.format("%s -> %s", beanName, bean));
        });
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        /*for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName + ":" + context.getBean(beanName));
        }*/
        Map<String, IService> serviceMap = context.getBeansOfType(IService.class);
        serviceMap.forEach((beanName, bean) -> {
            System.out.println(beanName + ":" + bean);
        });
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println(context.getBean("name"));
    }

    @Test
    public void test5(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig5.class);
    }

    @Test
    public void test6(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig6.class);
    }

    @Test
    public void test7(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig7.class);
        context.getBeansOfType(String.class).forEach((beanName, bean)->{
            System.out.println(String.format("%s -> %s", beanName, bean));
        });
    }
}
