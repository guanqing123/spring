package com.javacode2021.lesson21.test11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 20:29
 **/
@Component
public class InjectService {
    private IService s1;
    private IService s2;

    @Autowired
    @Qualifier("service2")
    public void setS1(IService s1) {
        this.s1 = s1;
    }

    @Autowired
    @Qualifier("service1")
    public void setS2(IService s2) {
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "InjectService{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                '}';
    }
}
