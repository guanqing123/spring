package com.javacode2021.lesson6;

import lombok.Data;

/**
 * @description: TODO 按照名称自动注入
 * @Author guanqing
 * @Date 2021/12/14 22:58
 **/
@Data
public class DiAutowireByName {

    @Data
    public static class Service1 {
        private String desc;
    }

    @Data
    public static class Service2 {
        private String desc;
    }

    private Service1 service1;
    private Service2 service2;

    public void setService1(Service1 service1) {
        System.out.println("setService1->" + service1);
        this.service1 = service1;
    }

    public void setService2(Service2 service2) {
        System.out.println("setService2->" + service2);
        this.service2 = service2;
    }
}
