package com.javacode2021.lesson11;

import com.javacode2021.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/17 21:33
 **/
public class AutowireCandidateTest {

    @Test
    public void autowireCandidate(){
        String beanXml = "classpath:/com/javacode2021/lesson11/autowireCandidateBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean(AutowireCandidateBean.class)); //@1

        AutowireCandidateBean.IService service = context.getBean(AutowireCandidateBean.IService.class); //@2
        System.out.println(service);
    }
}
