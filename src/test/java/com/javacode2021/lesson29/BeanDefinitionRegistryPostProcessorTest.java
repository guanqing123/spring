package com.javacode2021.lesson29;

import com.javacode2021.lesson29.test0.MainConfig0;
import com.javacode2021.lesson29.test1.MainConfig1;
import com.javacode2021.lesson29.test2.LessonModel;
import com.javacode2021.lesson29.test2.MainConfig2;
import com.javacode2021.lesson29.test3.MainConfig3;
import com.javacode2021.lesson29.test3.UserModel;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/4/15 8:36
 **/
public class BeanDefinitionRegistryPostProcessorTest {
    @Test
    public void test0(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig0.class);
        context.refresh();
        System.out.println(context.getBean("userName"));
    }

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig1.class);
        context.refresh();
        context.getBeansOfType(String.class).forEach((beanName, bean) -> {
            System.out.println(String.format("%s->%s", beanName, bean));
        });
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig2.class);
        context.refresh();

        System.out.println(context.getBean(LessonModel.class));
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig3.class);
        context.refresh();

        context.getBeansOfType(UserModel.class).forEach((beanName, bean) -> {
            System.out.println(String.format("%s->%s", beanName, bean));
        });
    }


}
