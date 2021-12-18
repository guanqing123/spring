package com.javacode2021.lesson12;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/18 21:20
 **/
public class ActualTimeDependencyLazyBean {
    public ActualTimeDependencyLazyBean() {
        System.out.println("ActualTimeDependencyLazyBean实例化!");
    }

    private LazyInitBean lazyInitBean;

    public LazyInitBean getLazyInitBean() {
        return lazyInitBean;
    }

    public void setLazyInitBean(LazyInitBean lazyInitBean) {
        this.lazyInitBean = lazyInitBean;
        System.out.println("ActualTimeDependencyLazyBean.setLazyInitBean方法!");
    }
}
