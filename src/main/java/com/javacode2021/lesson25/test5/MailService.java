package com.javacode2021.lesson25.test5;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/1 12:35
 **/
@ToString
@Component
public class MailService {
    @Autowired
    MailConfig mailConfig;
}
