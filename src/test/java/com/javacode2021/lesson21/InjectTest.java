package com.javacode2021.lesson21;

import com.javacode2021.lesson21.test0.MainConfig0;
import com.javacode2021.lesson21.test1.MainConfig1;
import com.javacode2021.lesson21.test10.MainConfig10;
import com.javacode2021.lesson21.test11.MainConfig11;
import com.javacode2021.lesson21.test12.MainConfig12;
import com.javacode2021.lesson21.test13.MainConfig13;
import com.javacode2021.lesson21.test14.MainConfig14;
import com.javacode2021.lesson21.test15.MainConfig15;
import com.javacode2021.lesson21.test17.MainConfig17;
import com.javacode2021.lesson21.test18.MainConfig18;
import com.javacode2021.lesson21.test18.OrderService;
import com.javacode2021.lesson21.test18.UserService;
import com.javacode2021.lesson21.test2.MainConfig2;
import com.javacode2021.lesson21.test3.MainConfig3;
import com.javacode2021.lesson21.test4.MainConfig4;
import com.javacode2021.lesson21.test5.MainConfig5;
import com.javacode2021.lesson21.test6.MainConfig6;
import com.javacode2021.lesson21.test7.MainConfig7;
import com.javacode2021.lesson21.test8.MainConfig8;
import com.javacode2021.lesson21.test9.MainConfig9;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 12:16
 **/
public class InjectTest {

    @Test
    public void test0(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig0.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test5(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig5.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test6(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig6.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test7(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig7.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test8(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig8.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test9(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig9.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test10(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig10.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test11(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig11.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test12(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig12.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test13(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig13.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test14(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig14.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test15(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig15.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test17(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig17.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test18(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig18.class);
        System.out.println(context.getBean(UserService.class).getDao());
        System.out.println(context.getBean(OrderService.class).getDao());
    }
}
