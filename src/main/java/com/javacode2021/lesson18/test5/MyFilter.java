package com.javacode2021.lesson18.test5;

import com.javacode2021.lesson18.test4.IService;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/1/3 22:48
 **/
public class MyFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        Class curClass = null;
        try {
            /** 当前被扫描的类 */
            curClass = Class.forName(metadataReader.getClassMetadata().getClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /** 判断curClass是否是IService类型 */
        boolean result = IService.class.isAssignableFrom(curClass);
        return result;
    }
}
