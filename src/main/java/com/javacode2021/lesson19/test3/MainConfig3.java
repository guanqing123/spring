package com.javacode2021.lesson19.test3;

import com.javacode2021.lesson19.test3.module1.ComponentScanModule1;
import com.javacode2021.lesson19.test3.module2.ComponentScanModule2;
import org.springframework.context.annotation.Import;

/**
 * @description: 通过@Import导入多个@CompontentScan标注的配置类
 * @Author guanqing
 * @Date 2022/4/20 8:48
 **/
@Import({ComponentScanModule1.class, ComponentScanModule2.class})
public class MainConfig3 {
}
