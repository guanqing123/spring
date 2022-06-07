package com.javacode2021.lesson27.userregister3;

import com.javacode2021.lesson27.event3.AbstractEvent;
import com.javacode2021.lesson27.event3.EventListener;
import com.javacode2021.lesson27.event3.EventMulticaster;
import com.javacode2021.lesson27.event3.SimpleEventMulticaster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @description: 配置文件
 * @Author guanqing
 * @Date 2022/6/7 8:45
 **/
@Configuration
@ComponentScan
public class MainConfig0 {

    @Bean
    public EventMulticaster eventMulticaster(List<EventListener> eventList){
        EventMulticaster eventMulticaster = new SimpleEventMulticaster();
        Optional.ofNullable(eventList).orElse(new ArrayList<>()).forEach(eventMulticaster::addEventListener);
        return eventMulticaster;
    }

    @Bean
    public UserRegisterService userRegisterService(EventMulticaster eventMulticaster){
        UserRegisterService userRegisterService = new UserRegisterService();
        userRegisterService.setEventMulticaster(eventMulticaster);
        return userRegisterService;
    }
}
