package com.javacode2021.lesson26;

import com.javacode2021.lesson26.demo1.MainConfig1;
import com.javacode2021.lesson26.demo2.MainConfig2;
import com.javacode2021.lesson26.demo3.MainConfig3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/6/6 17:01
 **/
public class MessageSourceTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig1.class);
        context.refresh();
        /** 未指定Locale，此时系统会取默认的locale对象，本地默认的值中文【中国】，即：zh_CN */
        System.out.println(context.getMessage("name", null, null));
        /** CHINA对应：zh_CN */
        System.out.println(context.getMessage("name", null, Locale.CHINA));
        /** UK对应en_GB */
        System.out.println(context.getMessage("name", null, Locale.UK));
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig1.class);
        context.refresh();
        System.out.println(context.getMessage("personal_introduction", new String[]{"spring高手", "java高手"}, Locale.CHINA));
        System.out.println(context.getMessage("personal_introduction", new String[]{"spring", "java"}, Locale.UK));
    }

    @Test
    public void test3() throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig2.class);
        context.refresh();
        /** 输出2次 */
        for (int i = 0; i < 2; i++) {
            System.out.println(context.getMessage("address", null, Locale.CHINA));
            TimeUnit.SECONDS.sleep(5);
        }
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig3.class);
        context.refresh();
        System.out.println(context.getMessage("desc", null, Locale.CHINA));
        System.out.println(context.getMessage("desc", null, Locale.UK));
    }
}
