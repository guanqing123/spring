package com.javacode2021.lesson27.event2;

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
 * @Date 2022/6/6 22:25
 **/
public class SimpleEventMulticaster implements EventMulticaster {

    private Map<Class<?>, List<EventListener>> eventObjectMap = new ConcurrentHashMap<>();

    @Override
    public void multicaster(AbstractEvent event) {
        List<EventListener> eventListeners = this.eventObjectMap.get(event.getClass());
        Optional.ofNullable(eventListeners).orElse(new ArrayList<>()).forEach(eventListener -> eventListener.onEvent(event));
    }

    @Override
    public void addEventListener(EventListener eventListener) {
        Class<?> eventType = this.getEventType(eventListener);
        List<EventListener> eventListeners = this.eventObjectMap.get(eventType);
        if (eventListeners == null) {
            eventListeners = new ArrayList<>();
            this.eventObjectMap.put(eventType, eventListeners);
        }
        eventListeners.add(eventListener);
    }

    @Override
    public void removeEventListener(EventListener eventListener) {
        Class<?> eventType = this.getEventType(eventListener);
        List<EventListener> eventListeners = this.eventObjectMap.get(eventType);
        if (eventListeners != null) {
            eventListeners.remove(eventListener);
        }
    }

    private Class<?> getEventType(EventListener eventListener) {
        ParameterizedType parameterizedType = (ParameterizedType) eventListener.getClass().getGenericInterfaces()[0];
        Type eventType = parameterizedType.getActualTypeArguments()[0];
        return (Class<?>) eventType;
    }
}
