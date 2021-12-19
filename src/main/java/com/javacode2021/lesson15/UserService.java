package com.javacode2021.lesson15;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/19 18:28
 **/
public class UserService implements IUserService {
    @Override
    public void insert(String name) {
        System.out.println(String.format("用户[name:%s]插入成功!", name));
    }
}
