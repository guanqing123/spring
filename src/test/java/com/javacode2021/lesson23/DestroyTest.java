package com.javacode2021.lesson23;

import com.javacode2021.lesson23.demo11.MainConfig;
import com.javacode2021.lesson23.demo11.ServiceA;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/26 8:57
 **/
public class DestroyTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig.class);
        /** 启动容器 */
        System.out.println("准备启动容器");
        context.refresh();
        System.out.println("容器启动完毕");
        System.out.println("serviceA: " + context.getBean(ServiceA.class));
        /** 关闭容器 */
        System.out.println("准备关闭容器");
        /** 调用容器的close方法,会触发bean的销毁操作 */
        context.close(); //@2
        System.out.println("容器关闭完毕");
    }
}
