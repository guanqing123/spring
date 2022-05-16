package com.javacode2021.lesson22.test3;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ImportResource;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 17:01
 **/
@Configurable
@ImportResource("classpath:/com/javacode2021/lesson22/test3/beans*.xml")
public class MainConfig3 {
}
