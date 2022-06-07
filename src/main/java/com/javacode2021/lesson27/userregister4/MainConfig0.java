package com.javacode2021.lesson27.userregister4;

import com.javacode2021.lesson27.event4.EventListener;
import com.javacode2021.lesson27.event4.EventMulticaster;
import com.javacode2021.lesson27.event4.SimpleEventMulticaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 14:07
 **/
@Configuration
@ComponentScan
public class MainConfig0 {

    @Bean
    @Autowired(required = false)
    public EventMulticaster eventMulticaster(List<EventListener> listeners){
        EventMulticaster eventMulticaster = new SimpleEventMulticaster();
        Optional.ofNullable(listeners).orElse(new ArrayList<>()).forEach(eventMulticaster::addEventListener);
        return eventMulticaster;
    }

    @Bean
    public UserRegisterService userRegisterService(EventMulticaster eventMulticaster){
        UserRegisterService userRegisterService = new UserRegisterService();
        userRegisterService.setEventMulticaster(eventMulticaster);
        return userRegisterService;
    }
}
