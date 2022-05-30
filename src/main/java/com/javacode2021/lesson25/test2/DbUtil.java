package com.javacode2021.lesson25.test2;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/30 21:04
 **/
public class DbUtil {
    /**
     * 模拟从db中获取邮件配置信息
     * @Author guanqing
     * @Date 2022/5/30 21:06
     **/
    public static Map<String, Object> getMailInfoFromDb(){
        Map<String, Object> result = new HashMap<>();
        result.put("mail.host", "smtp.qq.com");
        result.put("mail.username", "路人");
        result.put("mail.password", "123");
        return result;
    }
}
