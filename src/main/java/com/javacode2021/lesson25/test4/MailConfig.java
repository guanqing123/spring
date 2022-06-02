package com.javacode2021.lesson25.test4;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/1 9:38
 **/
@Data
@Component
@RefreshScope //@1
public class MailConfig {

    @Value("${mail.username}") //@2
    private String username;
}
