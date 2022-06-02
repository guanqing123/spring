package com.javacode2021.lesson25.test5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.MapPropertySource;

import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/1 12:42
 **/
public class RefreshConfigUtil {

    public static void updateDbConfig(AbstractApplicationContext context){
        refreshMailPropertySource(context);

        BeanRefreshScope.clean();
    }

    public static void refreshMailPropertySource(AbstractApplicationContext context){
        Map<String, Object> mailInfoFromDb = DbUtil.getMailInfoFromDb();
        MapPropertySource propertySource = new MapPropertySource("mail", mailInfoFromDb);
        context.getEnvironment().getPropertySources().addFirst(propertySource);
    }
}
