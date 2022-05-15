package com.javacode2021.lesson21.test8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/15 19:52
 **/
@Component
@Qualifier("tag1")
public class Service2 implements IService {
}
