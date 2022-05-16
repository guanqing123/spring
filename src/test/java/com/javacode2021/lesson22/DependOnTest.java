package com.javacode2021.lesson22;

import com.javacode2021.lesson22.test1.MainConfig1;
import com.javacode2021.lesson22.test1.Service1;
import com.javacode2021.lesson22.test2.MainConfig2;
import com.javacode2021.lesson22.test3.MainConfig3;
import com.javacode2021.lesson22.test4.MainConfig4;
import com.javacode2021.lesson22.test5.MainConfig5;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 8:48
 **/
public class DependOnTest {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        System.out.println(context.getBean(Service1.class));
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println(context.getBean(Service1.class));
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test4(){
        System.out.println("准备启动spring容器");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("spring容器启动完毕");
        System.out.println(context.getBean(com.javacode2021.lesson22.test4.Service1.class));
    }

    @Test
    public void test5(){
        System.out.println("准备启动spring容器");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig5.class);
        System.out.println("spring容器启动完毕");

        for (String beanName : Arrays.asList("name", "age", "address")) {
            System.out.println("--------------");
            System.out.println("getBean:" + beanName + ",start");
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
            System.out.println("getBean:" + beanName + ",end");
        }
    }
}
