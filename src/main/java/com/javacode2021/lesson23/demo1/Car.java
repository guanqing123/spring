package com.javacode2021.lesson23.demo1;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 20:51
 **/
public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
