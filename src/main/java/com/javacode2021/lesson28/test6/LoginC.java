package com.javacode2021.lesson28.test6;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/15 8:57
 **/
/** 代理 */
public class LoginC implements ILogin {

    private ILogin target;

    public LoginC(ILogin target) {
        this.target = target;
    }
}
