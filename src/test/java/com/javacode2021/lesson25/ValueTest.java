package com.javacode2021.lesson25;

import com.javacode2021.lesson25.test1.DbConfig;
import com.javacode2021.lesson25.test1.MainConfig1;
import com.javacode2021.lesson25.test2.DbUtil;
import com.javacode2021.lesson25.test2.MailConfig;
import com.javacode2021.lesson25.test2.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MapPropertySource;

import java.util.Map;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/30 9:00
 **/
public class ValueTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig1.class);
        context.refresh();

        DbConfig dbConfig = context.getBean(DbConfig.class);
        System.out.println(dbConfig);
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        /** 下面这段是关键 start */
        /** 模拟从db中获取配置信息 */
        Map<String, Object> mailInfoFromDb = DbUtil.getMailInfoFromDb();
        /** 将其丢在MapPropertySource中（MapPropertySource类是spring提供的一个类，是PropertySource的子类） */
        MapPropertySource mailPropertySource = new MapPropertySource("mail", mailInfoFromDb);
        /** 将mailPropertySource丢在Environment中的PropertySource列表的第一个中，让优先级最高 */
        context.getEnvironment().getPropertySources().addFirst(mailPropertySource);
        /** 上面这段是关键 end */

        context.register(MainConfig2.class);
        context.refresh();

        MailConfig mailConfig = context.getBean(MailConfig.class);
        System.out.println(mailConfig);
    }

}
