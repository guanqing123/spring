package com.javacode2021.lesson27.userregister3;

import com.javacode2021.lesson27.event3.EventMulticaster;

/**
 * @description: 用户注册服务
 * @Author guanqing
 * @Date 2022/6/7 8:29
 **/
public class UserRegisterService {

    private EventMulticaster eventMulticaster;

    public void registerUser(String userId) {
        System.out.println(String.format("模拟数据库注册用户【%s】", userId));

        this.eventMulticaster.multicaster(new UserRegisterSuccessEvent(this, userId));
    }

    public EventMulticaster getEventMulticaster() {
        return eventMulticaster;
    }

    public void setEventMulticaster(EventMulticaster eventMulticaster) {
        this.eventMulticaster = eventMulticaster;
    }
}
