package com.javacode2021.lesson27.ztest4;

import com.javacode2021.lesson27.ztest2.UserRegisterService;
import com.javacode2021.lesson27.ztest3.UserRegisterListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;

import java.util.concurrent.Executor;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 21:23
 **/
@Import({UserRegisterListener.class, UserRegisterService.class})
@Configuration
@ComponentScan
public class MainConfig4 {
    @Bean
    public ApplicationEventMulticaster applicationEventMulticaster(){ //@1
        /** 创建一个事件广播器 */
        SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
        /** 给广播器提供一个线程池,通过这个线程池来调用事件监听器 */
        Executor executor = this.applicationEventMulticasterThreadPool().getObject();
        /** 设置异步执行器 */
        multicaster.setTaskExecutor(executor);
        return multicaster;
    }

    @Bean
    public ThreadPoolExecutorFactoryBean applicationEventMulticasterThreadPool(){
        ThreadPoolExecutorFactoryBean result = new ThreadPoolExecutorFactoryBean();
        result.setThreadNamePrefix("applicationEventMulticasterThreadPool-");
        result.setCorePoolSize(5);
        return result;
    }
}
