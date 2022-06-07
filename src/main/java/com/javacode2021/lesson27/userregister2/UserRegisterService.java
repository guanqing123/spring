package com.javacode2021.lesson27.userregister2;

import com.javacode2021.lesson27.event2.EventMulticaster;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/6 22:44
 **/
public class UserRegisterService {

    private EventMulticaster eventMulticaster;

    public void registerUser(String userName) {
        System.out.println(String.format("模拟向数据库插入一个用户【%s】", userName));

        this.eventMulticaster.multicaster(new UserRegisterSuccessEvent(this, userName));
    }

    public EventMulticaster getEventMulticaster() {
        return eventMulticaster;
    }

    public void setEventMulticaster(EventMulticaster eventMulticaster) {
        this.eventMulticaster = eventMulticaster;
    }
}
