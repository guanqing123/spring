package com.javacode2021.lesson27.userregister4;

import com.javacode2021.lesson27.event4.AbstractEvent;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 14:05
 **/
public class UserRegisterSuccessEvent extends AbstractEvent {

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
