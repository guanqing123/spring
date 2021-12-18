package com.javacode2021.lesson13;

import com.javacode2021.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/18 21:43
 **/
public class BeanExtendTest {
    @Test
    public void normalBean(){
        String beanXml = "classpath:/com/javacode2021/lesson13/beanExtend.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("serviceB:" + context.getBean(ServiceB.class));
        System.out.println("serviceC:" + context.getBean(ServiceC.class));
    }

    @Test
    public void extendBean() {
        String beanXml = "classpath:/com/javacode2021/lesson13/beanExtend2.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("serviceB:" + context.getBean(ServiceB.class));
        System.out.println("serviceC:" + context.getBean(ServiceC.class));
        System.out.println(context.getBean("baseService"));
    }
}
