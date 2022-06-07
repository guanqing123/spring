package com.javacode2021.lesson27.event3;

/**
 * 事件监听器
 * @Author guanqing
 * @Date 2022/6/7 8:12
 **/
public interface EventListener<E extends AbstractEvent> {

    /**
     * 处理事件
     * @param event
     */
    void onEvent(E event);
}
