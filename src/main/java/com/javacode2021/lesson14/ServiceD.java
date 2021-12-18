package com.javacode2021.lesson14;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/18 22:31
 **/
public class ServiceD implements ApplicationContextAware { //@1

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void say() {
        ServiceC serviceC = this.getServiceC(); //@2
        System.out.println("this:" + this + ",serviceC:" + serviceC);
    }

    public ServiceC getServiceC() {
        return this.context.getBean(ServiceC.class); //@3
    }
}
