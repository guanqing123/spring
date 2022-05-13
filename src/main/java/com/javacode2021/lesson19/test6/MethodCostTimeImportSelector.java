package com.javacode2021.lesson19.test6;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/13 9:18
 **/
public class MethodCostTimeImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
          MethodCostTimeProxyBeanPostProcessor.class.getName()
        };
    }
}
