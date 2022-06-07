package com.javacode2021.lesson27.userregister3;

import com.javacode2021.lesson27.event3.AbstractEvent;

/**
 * @description: 用户注册成功事件
 * @Author guanqing
 * @Date 2022/6/7 8:28
 **/
public class UserRegisterSuccessEvent extends AbstractEvent {

    /** 用户id */
    private String userId;

    public UserRegisterSuccessEvent(Object source, String userId) {
        super(source);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
