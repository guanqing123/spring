package com.javacode2021.lesson20.test6;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 20:58
 **/
@Configuration
@Conditional({Condition1.class, Condition2.class, Condition3.class})
public class MainConfig6 {
}

@Order(1) //@1
class Condition1 implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.out.println(this.getClass().getName());
        return true;
    }
}

class Condition2 implements Condition, Ordered { //@2
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.out.println(this.getClass().getName());
        return true;
    }

    @Override
    public int getOrder() { //@3
        return 0;
    }
}

class Condition3 implements Condition, PriorityOrdered { //@4
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.out.println(this.getClass().getName());
        return true;
    }

    @Override
    public int getOrder() {
        return 1000;
    }
}
