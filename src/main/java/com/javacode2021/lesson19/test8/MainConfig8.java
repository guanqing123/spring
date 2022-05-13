package com.javacode2021.lesson19.test8;

import org.springframework.context.annotation.Import;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/13 12:34
 **/
@Import({
        DeferredImportSelector1.class,
        DeferredImportSelector2.class
})
public class MainConfig8 {
}
