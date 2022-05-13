package com.javacode2021.lesson19.test7;

import org.springframework.context.annotation.Import;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/13 11:30
 **/
@Import({
        DeferredImportSelector1.class,
        Configuration3.class,
        ImportSelector1.class
})
public class MainConfig7 {
}
