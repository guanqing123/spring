package com.javacode2021.lesson27.event4;

/**
 * 事件
 */
public class AbstractEvent {

    /** 事件源 */
    private Object source;

    public AbstractEvent(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
