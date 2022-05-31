package com.javacode2021.lesson25.test3;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/31 8:26
 **/
@Component
@MyScope //@1
public class User {

    private String username;

    public User() {
        System.out.println("------------创建User对象" + this); //@2
        this.username = UUID.randomUUID().toString(); //@3
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
