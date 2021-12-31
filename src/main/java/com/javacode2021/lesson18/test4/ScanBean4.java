package com.javacode2021.lesson18.test4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/31 9:58
 **/
@ComponentScan(
    useDefaultFilters = false, //不启用默认过滤器
    includeFilters = {
            @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = IService.class) //@1
    }
)
public class ScanBean4 {
}
