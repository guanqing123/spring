package com.javacode2021.lesson27.userregister4;

import com.javacode2021.lesson27.event4.EventListener;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 14:11
 **/
@Component
public class UserRegisterSuccessEventListener implements EventListener<UserRegisterSuccessEvent> {
    @Override
    public void onEvent(UserRegisterSuccessEvent event) {
        System.out.println(String.format("监听到用户【%s】注册成功事件", event.getUserId()));
    }
}
