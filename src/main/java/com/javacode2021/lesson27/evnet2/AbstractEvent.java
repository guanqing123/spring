package com.javacode2021.lesson27.evnet2;

/**
 * 事件
 */
public abstract class AbstractEvent {
    /** 事件源 */
    protected Object source;

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
