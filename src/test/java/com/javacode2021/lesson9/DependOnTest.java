package com.javacode2021.lesson9;

import com.javacode2021.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/16 9:14
 **/
public class DependOnTest {

    @Test
    public void normalBean() {
        System.out.println("容器启动中！");
        String beanXml = "classpath:/com/javacode2021/lesson9/normalBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("容器启动完毕,准备关闭spring容器!");
        /** 关闭容器 */
        context.close();
        System.out.println("spring容器已关闭!");
    }

    @Test
    public void strongDependenceBean() {
        System.out.println("容器启动中！");
        String beanXml = "classpath:/com/javacode2021/lesson9/strongDependenceBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("容器启动完毕,准备关闭spring容器!");
        /** 关闭容器 */
        context.close();
        System.out.println("spring容器已关闭!");
    }
}
