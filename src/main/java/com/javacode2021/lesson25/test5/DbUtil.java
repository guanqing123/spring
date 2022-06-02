package com.javacode2021.lesson25.test5;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/1 12:36
 **/
public class DbUtil {
    public static Map getMailInfoFromDb(){
        Map map = new HashMap();
        map.put("mail.username", UUID.randomUUID().toString());
        return map;
    }
}
