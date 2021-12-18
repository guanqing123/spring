package com.javacode2021.lesson11;

import java.util.List;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/17 21:27
 **/
public class AutowireCandidateBean {
    public interface IService {} //@1

    public static class ServiceA implements IService {} //@2
    public static class ServiceB implements IService {} //@3

    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    private List<IService> iServices;

    public void setiServices(List<IService> iServices) {
        this.iServices = iServices;
    }

    @Override
    public String toString() {
        return "SetterBean{" +
                "service=" + service +
                "iServices="+ iServices +
                "}";
    }
}
