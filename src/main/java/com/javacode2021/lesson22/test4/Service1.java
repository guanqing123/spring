package com.javacode2021.lesson22.test4;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 17:15
 **/
@Component
@Lazy //@1
public class Service1 {
    public Service1() {
        System.out.println("创建Service1");
    }
}
