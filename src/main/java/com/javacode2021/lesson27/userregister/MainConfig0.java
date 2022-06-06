package com.javacode2021.lesson27.userregister;

import com.javacode2021.lesson27.event.EventListener;
import com.javacode2021.lesson27.event.EventMulticaster;
import com.javacode2021.lesson27.event.SimpleEventMulticaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan
public class MainConfig0 {

    /**
     * 注册一个bean: 事件发布者
     *
     * @param eventListeners
     * @return
     */
    @Bean
    @Autowired(required = false)
    public EventMulticaster eventMulticaster(List<EventListener> eventListeners){
        EventMulticaster eventPublisher = new SimpleEventMulticaster();
        if (eventListeners != null) {
            eventListeners.forEach(eventPublisher::addEventListener);
        }
        return eventPublisher;
    }

    /**
     * 注册一个bean：用户注册服务
     *
     * @param eventMulticaster
     * @return
     */
    @Bean
    public UserRegisterService userRegisterService(EventMulticaster eventMulticaster) {
        UserRegisterService userRegisterService = new UserRegisterService();
        userRegisterService.setEventMulticaster(eventMulticaster);
        return userRegisterService;
    }
}
