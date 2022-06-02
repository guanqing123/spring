package com.javacode2021.lesson25.test4;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/1 11:29
 **/
public class DbUtil {
    /** 模拟从db中获取邮件配置信息 */
    public static Map<String, Object> getMailInfoFromDb(){
        Map<String, Object> result = new HashMap<>();
        result.put("mail.username", UUID.randomUUID().toString());
        return result;
    }
}
