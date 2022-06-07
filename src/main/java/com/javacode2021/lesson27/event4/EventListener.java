package com.javacode2021.lesson27.event4;

/**
 * 事件监听器
 */
public interface EventListener<E extends AbstractEvent> {

    /**
     * 响应处理事件
     * @param event
     */
    void onEvent(E event);
}
