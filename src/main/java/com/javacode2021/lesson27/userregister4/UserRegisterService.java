package com.javacode2021.lesson27.userregister4;

import com.javacode2021.lesson27.event4.EventMulticaster;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 14:04
 **/
public class UserRegisterService {

    private EventMulticaster eventMulticaster;

    public void register(String userId) {
        System.out.println(String.format("模拟数据库插入用户【%s】", userId));

        this.eventMulticaster.multicaster(new UserRegisterSuccessEvent(this, userId));
    }

    public EventMulticaster getEventMulticaster() {
        return eventMulticaster;
    }

    public void setEventMulticaster(EventMulticaster eventMulticaster) {
        this.eventMulticaster = eventMulticaster;
    }
}
