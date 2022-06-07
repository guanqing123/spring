package com.javacode2021.lesson27.event4;

/**
 * 广播器
 */
public interface EventMulticaster {

    /**
     * 广播事件
     * @param event
     */
    void multicaster(AbstractEvent event);

    /**
     * 添加事件监听器
     * @param listener
     */
    void addEventListener(EventListener listener);

    /**
     * 删除事件监听器
     * @param listener
     */
    void removeEventListener(EventListener listener);
}
