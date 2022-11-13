package com.javacode2021.lesson6.scope;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/11/13 11:07
 **/
public class BeanScopeModel {

    ThreadLocal<Map<String, Object>> local = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new HashMap();
        }
    };

    public BeanScopeModel(String beanScope) {
        final Map<String, Object> map = local.get();
        System.out.println(String.format("create BeanScopeModel scope=%s, this=%s", beanScope, this));
    }
}
