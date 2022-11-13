package com.javacode2021.lesson6;

import com.javacode2021.lesson6.ThreadScope.ThreadScope;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/11/13 17:28
 **/
public class ThreadScopeTest {
    @Test
    public void ThreadScopeTest() throws InterruptedException {
        String beanXml = "com/javacode2021/lesson6/ThreadScope/beans-thread.xml";
        /** 手动创建容器 */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        /** 设置配置文件位置 */
        context.setConfigLocation(beanXml);
        /** 启动容器 */
        context.refresh();
        /** 向容器中注册自定义的scope */
        context.getBeanFactory().registerScope(ThreadScope.THREAD_SCOPE, new ThreadScope());

        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread() + "," + context.getBean("threadBean"));
                System.out.println(Thread.currentThread() + "," + context.getBean("threadBean"));
            }).start();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
