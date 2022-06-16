package com.javacode2021.lesson28.test6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/15 8:57
 **/
@Component
public class X {

    @Autowired
    private ILogin login;

    public ILogin getLogin() {
        return login;
    }

    public void setLogin(ILogin login) {
        this.login = login;
    }
}
