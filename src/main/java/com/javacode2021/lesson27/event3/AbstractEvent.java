package com.javacode2021.lesson27.event3;

/**
 * 事件
 * @Author guanqing
 * @Date 2022/6/7 8:10
 **/
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
