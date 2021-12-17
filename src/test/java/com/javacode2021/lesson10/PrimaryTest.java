package com.javacode2021.lesson10;

import com.javacode2021.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/17 12:58
 **/
public class PrimaryTest {

    @Test
    public void normalBean(){
        String beanXml = "classpath:/com/javacode2021/lesson10/NormalBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        NormalBean.IService service = context.getBean(NormalBean.IService.class);//@1
        System.out.println(service);
    }

    @Test
    public void setterBean(){
        String beanXml = "classpath:/com/javacode2021/lesson10/setterBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
    }

    @Test
    public void primaryBean(){
        String beanXml = "classpath:/com/javacode2021/lesson10/primaryBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        PrimaryBean.IService service = context.getBean(PrimaryBean.IService.class); //@1
        System.out.println(service);
        PrimaryBean primaryBean = context.getBean(PrimaryBean.class);//@2
        System.out.println(primaryBean);
    }
}
