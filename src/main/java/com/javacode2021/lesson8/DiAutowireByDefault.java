package com.javacode2021.lesson8;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description: TODO 构造函数的方式进行自动注入
 * @Author guanqing
 * @Date 2021/12/15 21:21
 **/
@Getter
@Setter
@ToString
public class DiAutowireByDefault {

    @Data
    public static class BaseService {
        private String desc;
    }

    /** Service1继承BaseService */
    public static class Service1 extends BaseService {}

    /** Service2继承BaseService */
    public static class Service2 extends BaseService {}

    private Service1 service1;
    private Service2 service2;

    public DiAutowireByDefault() {//@0
    }

    public DiAutowireByDefault(Service1 service1) {//@1
        System.out.println("DiAutowireByConstructor(Service1 service1)");
        this.service1 = service1;
    }

    public DiAutowireByDefault(Service1 service1, Service2 service2) { //@2
        System.out.println("DiAutowireByConstructor(Service1 service1, Service2 service2)");
        this.service1 = service1;
        this.service2 = service2;
    }
}
