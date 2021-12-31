package com.javacode2021.lesson18.test3;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component //@1
public @interface MyBean {
    @AliasFor(annotation = Component.class) //@2
    String value() default ""; //@3
}
