package com.javacode2021.lesson19;

import com.javacode2021.lesson19.test1.MainConfig1;
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
}
