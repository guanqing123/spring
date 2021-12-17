package com.javacode2021.lesson10;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/17 13:10
 **/
public class SetterBean {
    public interface IService{} //@1
    public static class ServiceA implements IService {}//@2
    public static class ServiceB implements IService {}//@3

    private IService service;

    public void setService(IService service) {
        this.service = service;
    }
}
