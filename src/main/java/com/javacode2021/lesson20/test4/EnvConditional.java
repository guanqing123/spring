package com.javacode2021.lesson20.test4;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Conditional(EnvCondition.class) //@1
public @interface EnvConditional {
    /** 环境(测试环境、开发环境、生产环境) */
    enum Env { //@2
        TEST, DEV, PROD
    }

    Env value() default Env.DEV; //@3
}
