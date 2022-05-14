package com.javacode2021.lesson20.test4;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/14 19:32
 **/
public class EnvCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        /** 当前需要使用的环境 */
        EnvConditional.Env curEnv = EnvConditional.Env.PROD; //@1
        /** 获取使用条件的类上的EnvCondition注解中对应的环境 */
        EnvConditional.Env env = (EnvConditional.Env) metadata.getAllAnnotationAttributes(EnvConditional.class.getName()).get("value").get(0);
        return env.equals(curEnv);
    }
}
