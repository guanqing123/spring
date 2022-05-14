package com.javacode2021.lesson20.test4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 20:13
 **/
@Configuration
@Import({DevBeanConfig.class, TestBeanConfig.class, ProdBeanConfig.class})
public class MainConfig4 {
}
