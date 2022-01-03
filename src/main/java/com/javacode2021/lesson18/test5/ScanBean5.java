package com.javacode2021.lesson18.test5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/1/3 22:52
 **/
@ComponentScan(
        basePackages = {"com.javacode2021.lesson18.test4"},
        useDefaultFilters = false, //不启用默认过滤器
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyFilter.class)//@1
        })
public class ScanBean5 {
}
