package com.javacode2021.lesson27.event2;

/**
 * 事件监听器
 *
 * @param <E>
 */
public interface EventListener<E extends AbstractEvent> {

    /**
     * 监听事件
     * @param event
     */
    void onEvent(E event);
}
