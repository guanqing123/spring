package com.javacode2021.lesson23.demo1;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 21:10
 **/
public class User {
    private String name;

    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
