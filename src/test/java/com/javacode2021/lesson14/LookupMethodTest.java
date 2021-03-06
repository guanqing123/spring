package com.javacode2021.lesson14;

import com.javacode2021.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/18 22:21
 **/
public class LookupMethodTest {

    @Test
    public void normalBean() {
        String beanXml = "classpath:/com/javacode2021/lesson14/Service.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);

        System.out.println(context.getBean(ServiceA.class)); //@1
        System.out.println(context.getBean(ServiceA.class)); //@2

        System.out.println("serviceB中的serviceA");
        ServiceB serviceB = context.getBean(ServiceB.class); //@3
        System.out.println(serviceB.getServiceA()); //@4
        System.out.println(serviceB.getServiceA()); //@5
    }

    @Test
    public void applicationContextAware() {
        String beanXml = "classpath:/com/javacode2021/lesson14/applicationContextAware.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);

        System.out.println(context.getBean(ServiceC.class));//@1
        System.out.println(context.getBean(ServiceC.class));//@2

        System.out.println("serviceD中的serviceC");
        ServiceD serviceD = context.getBean(ServiceD.class);//@3
        serviceD.say();
        serviceD.say();
    }

    @Test
    public void lookUpMethod(){
        String beanXml = "classpath:/com/javacode2021/lesson14/lookupmethod.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);

        System.out.println(context.getBean(ServiceE.class));//@1
        System.out.println(context.getBean(ServiceE.class));//@2

        System.out.println("serviceF中的serviceE");
        ServiceF serviceF = context.getBean(ServiceF.class);//@3
        serviceF.say();
        serviceF.say();
    }

    @Test
    public void replacedMethod() {
        String beanXml = "classpath:/com/javacode2021/lesson14/replacedmethod.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);

        System.out.println(context.getBean(ServiceG.class)); //@1
        System.out.println(context.getBean(ServiceG.class)); //@2

        System.out.println("serviceH中的serviceG");
        ServiceH serviceH = context.getBean(ServiceH.class); //@3
        serviceH.say();
        serviceH.say();
    }
}
