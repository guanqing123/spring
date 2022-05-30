package com.javacode2021.lesson25.test3;

import org.springframework.context.annotation.Scope;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope(BeanMyScope.SCOPE_MY)
public @interface MyScope {
}
