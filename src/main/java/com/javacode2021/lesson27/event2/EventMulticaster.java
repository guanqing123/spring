package com.javacode2021.lesson27.event2;

/**
 * 事件广播器
 */
public interface EventMulticaster {

    /**
     * 广播事件
     * @param event
     */
    void multicaster(AbstractEvent event);

    /**
     * 添加事件监听器
     * @param eventListener
     */
    void addEventListener(EventListener eventListener);

    /**
     * 删除事件监听器
     * @param eventListener
     */
    void removeEventListener(EventListener eventListener);
}
