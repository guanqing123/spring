package com.javacode2021.lesson7;

import java.beans.ConstructorProperties;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/7 9:10
 **/
public class UserModel {
    private String name;
    private int age;
    /** 描述信息 */
    private String desc;

    public UserModel() {
    }

    public UserModel(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @ConstructorProperties({"n", "a", "d"})
    public UserModel(String name, int age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return age == userModel.age &&
                Objects.equals(name, userModel.name) &&
                Objects.equals(desc, userModel.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, desc);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UserModel userModel = new UserModel("n","d");
        Set set = new HashSet();
        set.add(null);
        set.add("ab");
        set.add(null);
        set.add(new UserModel());
        set.add(new UserModel());
        set.add(userModel);
        set.add(userModel);
        set.forEach(o -> System.out.println(o));
    }
}
