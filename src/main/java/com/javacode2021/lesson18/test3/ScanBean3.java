package com.javacode2021.lesson18.test3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/31 8:59
 **/
@ComponentScan(
        useDefaultFilters = false,
        includeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyBean.class)
        }
)
public class ScanBean3 {
}
