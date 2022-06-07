package com.javacode2021.lesson27.ztest1;

import org.springframework.context.ApplicationEvent;

/**
 * 订单创建事件
 */
public class OrderCreateEvent extends ApplicationEvent {
    /** 订单id */
    private String orderId;

    /**
     * @param source  事件源
     * @param orderId 订单id
     */
    public OrderCreateEvent(Object source, String orderId) {
        super(source);
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
