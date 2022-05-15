package com.javacode2021.lesson21.test18;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 21:41
 **/
public class BaseService<T> {
    @Autowired
    private IDao<T> dao; //@1

    public IDao<T> getDao() {
        return dao;
    }

    public void setDao(IDao<T> dao) {
        this.dao = dao;
    }
}
