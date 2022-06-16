package com.javacode2021.lesson29.test3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/13 9:34
 **/
public class UserModel {
    @Autowired
    private String name; //@1

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
