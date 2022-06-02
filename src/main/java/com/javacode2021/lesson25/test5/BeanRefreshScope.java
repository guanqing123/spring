package com.javacode2021.lesson25.test5;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/1 12:27
 **/
public class BeanRefreshScope implements Scope {

    public static final String SCOPE_REFRESH = "refresh";

    ConcurrentHashMap beanMap = new ConcurrentHashMap();

    private static BeanRefreshScope INSTANCE = new BeanRefreshScope();

    private BeanRefreshScope() {
    }

    public static BeanRefreshScope getInstance(){
        return INSTANCE;
    }

    public static void clean(){
        INSTANCE.beanMap.clear();
    }

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object bean = beanMap.get(name);
        if (bean == null){
            bean = objectFactory.getObject();
            beanMap.put(name, bean);
        }
        return bean;
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
