package com.javacode2021.lesson21.test17;

import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 21:27
 **/
public class InjectService {

    public Map<String, IService> getServiceMap1() {
        return serviceMap1;
    }

    public void setServiceMap1(Map<String, IService> serviceMap1) {
        this.serviceMap1 = serviceMap1;
    }

    private Map<String, IService> serviceMap1;

    @Override
    public String toString() {
        return "InjectService{" +
                "serviceMap1=" + serviceMap1 +
                '}';
    }
}
