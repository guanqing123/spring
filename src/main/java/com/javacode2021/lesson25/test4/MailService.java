package com.javacode2021.lesson25.test4;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/1 9:41
 **/
@ToString
@Component
public class MailService {
    @Autowired
    private MailConfig mailConfig;
}
