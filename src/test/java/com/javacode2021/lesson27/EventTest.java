package com.javacode2021.lesson27;

import com.javacode2021.lesson27.userregister.MainConfig0;
import com.javacode2021.lesson27.userregister.UserRegisterService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
}
