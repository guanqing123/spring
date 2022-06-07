package com.javacode2021.lesson27.event4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 13:55
 **/
public class SimpleEventMulticaster implements EventMulticaster{

    private Map<Class<?>, List<EventListener>> eventObjMap = new ConcurrentHashMap<>();

    @Override
    public void multicaster(AbstractEvent event) {
        List<EventListener> eventListeners = eventObjMap.get(event.getClass());
        Optional.ofNullable(eventListeners).orElse(new ArrayList<>()).forEach(listener -> listener.onEvent(event));
    }

    @Override
    public void addEventListener(EventListener listener) {
        Class<?> eventType = this.getEventType(listener);
        List<EventListener> eventListeners = this.eventObjMap.get(eventType);
        if (eventListeners == null) {
            eventListeners = new ArrayList<>();
            this.eventObjMap.put(eventType, eventListeners);
        }
        eventListeners.add(listener);
    }

    @Override
    public void removeEventListener(EventListener listener) {
        Class<?> eventType = this.getEventType(listener);
        List<EventListener> eventListeners = this.eventObjMap.get(eventType);
        if (eventListeners != null) {
            eventListeners.remove(listener);
        }
    }

    /**
     * 获取监听器监听的事件类型
     * @Author guanqing
     * @Date 2022/6/7 14:00
     **/
    public Class<?> getEventType(EventListener listener) {
        ParameterizedType parameterizedType = (ParameterizedType) listener.getClass().getGenericInterfaces()[0];
        Type eventType = parameterizedType.getActualTypeArguments()[0];
        return (Class<?>) eventType;
    }
}
