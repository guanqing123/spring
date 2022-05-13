package com.javacode2021.lesson19;

import com.javacode2021.lesson19.examination.MainExamConfig;
import com.javacode2021.lesson19.test1.MainConfig1;
import com.javacode2021.lesson19.test2.MainConfig2;
import com.javacode2021.lesson19.test3.MainConfig3;
import com.javacode2021.lesson19.test4.MainConfig4;
import com.javacode2021.lesson19.test5.MainConfig5;
import com.javacode2021.lesson19.test6.MainConfig6;
import com.javacode2021.lesson19.test6.Service1;
import com.javacode2021.lesson19.test6.Service2;
import com.javacode2021.lesson19.test7.MainConfig7;
import com.javacode2021.lesson19.test8.MainConfig8;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/1/6 9:03
 **/
public class ImportTest {
    @Test
    public void test1(){
        /** 1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类 */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        /** 2.输出容器中定义的所有bean信息 */
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test2(){
        /** 1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类 */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        /** 2.输出容器中定义的所有bean信息 */
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test3(){
        /** 1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类 */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        /** 2.输出容器中定义的所有bean信息 */
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test4(){
        /** 1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类 */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        /** 2.输出容器中定义的所有bean信息 */
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test5(){
        /** 1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类 */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig5.class);
        /** 2.输出容器中定义的所有bean信息 */
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s -> %s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void test6(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig6.class);
        Service1 service1 = context.getBean(Service1.class);
        Service2 service2 = context.getBean(Service2.class);
        service1.m1();
        service2.m1();
    }

    @Test
    public void testExam(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainExamConfig.class);
        com.javacode2021.lesson19.examination.Service1 service1 = context.getBean(com.javacode2021.lesson19.examination.Service1.class);
        com.javacode2021.lesson19.examination.Service2 service2 = context.getBean(com.javacode2021.lesson19.examination.Service2.class);
        service1.m1();
        service2.m1();
    }

    @Test
    public void test7(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig7.class);
    }

    @Test
    public void test8(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig8.class);
    }
}
