package com.javacode2021.lesson27.userregister2;

import com.javacode2021.lesson27.evnet2.EventListener;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/6 22:53
 **/
@Component
public class SendEmailOnUserRegisterSuccessListener implements EventListener<UserRegisterSuccessEvent> {
    @Override
    public void onEvent(UserRegisterSuccessEvent event) {
        System.out.println(String.format("发送一封邮件给【%s】用户", event.getUserName()));
    }
}
