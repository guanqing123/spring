package com.javacode2021.lesson27.userregister2;

import com.javacode2021.lesson27.evnet2.AbstractEvent;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/6 22:43
 **/
public class UserRegisterSuccessEvent extends AbstractEvent {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;

    public UserRegisterSuccessEvent(Object source, String userName) {
        super(source);
        this.userName = userName;
    }
}
