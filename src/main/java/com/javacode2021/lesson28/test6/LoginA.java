package com.javacode2021.lesson28.test6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/15 8:56
 **/
@Component
public class LoginA implements ILogin {
    @Autowired
    private X x;

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }
}
