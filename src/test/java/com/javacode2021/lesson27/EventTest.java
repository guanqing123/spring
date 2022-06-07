package com.javacode2021.lesson27;

import com.javacode2021.lesson27.userregister.MainConfig0;
import com.javacode2021.lesson27.userregister.UserRegisterService;
import com.javacode2021.lesson27.ztest1.OrderCreateEvent;
import com.javacode2021.lesson27.ztest1.SendEmailOnOrderCreateListener;
import com.javacode2021.lesson27.ztest2.MainConfig2;
import com.javacode2021.lesson27.ztest2.UserRegisterEvent;
import com.javacode2021.lesson27.ztest3.UserRegisterListener;
import com.javacode2021.lesson27.ztest4.MainConfig4;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/6 21:55
 **/
public class EventTest {

    @Test
    public void test0(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig0.class);
        /** 获取用户注册服务 */
        UserRegisterService userRegisterService = context.getBean(UserRegisterService.class);
        /** 模拟用户注册 */
        userRegisterService.registerUser("路人甲Java");
    }

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(com.javacode2021.lesson27.userregister2.MainConfig0.class);
        context.refresh();
        com.javacode2021.lesson27.userregister2.UserRegisterService bean = context.getBean(com.javacode2021.lesson27.userregister2.UserRegisterService.class);
        bean.registerUser("测试用户");
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(com.javacode2021.lesson27.userregister4.MainConfig0.class);
        context.refresh();
        com.javacode2021.lesson27.userregister4.UserRegisterService bean = context.getBean(com.javacode2021.lesson27.userregister4.UserRegisterService.class);
        bean.register("001");
    }

    @Test
    public void test3(){
        /** 创建事件广播器 */
        ApplicationEventMulticaster applicationEventMulticaster = new SimpleApplicationEventMulticaster();
        /** 注册事件监听器 */
        applicationEventMulticaster.addApplicationListener(new SendEmailOnOrderCreateListener());
        /** 广播订单创建事件 */
        applicationEventMulticaster.multicastEvent(new OrderCreateEvent(applicationEventMulticaster, "22060001"));
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig2.class);
        context.refresh();
        /** 获取用户注册服务 */
        com.javacode2021.lesson27.ztest2.UserRegisterService userRegisterService = context.getBean(com.javacode2021.lesson27.ztest2.UserRegisterService.class);
        /** 模拟用户注册 */
        userRegisterService.registerUser("路人甲Java");
    }

    @Test
    public void test5(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(com.javacode2021.lesson27.ztest2.UserRegisterService.class);
        context.register(UserRegisterListener.class);
        context.refresh();
        com.javacode2021.lesson27.ztest2.UserRegisterService userRegisterService = context.getBean(com.javacode2021.lesson27.ztest2.UserRegisterService.class);
        userRegisterService.registerUser("路人甲Python");
    }

    @Test
    public void test6(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig4.class);
        context.refresh();
        com.javacode2021.lesson27.ztest2.UserRegisterService userRegisterService = context.getBean(com.javacode2021.lesson27.ztest2.UserRegisterService.class);
        userRegisterService.registerUser("路人甲异步");
    }
}
