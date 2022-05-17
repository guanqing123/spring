package com.javacode2021.lesson23;

import com.javacode2021.lesson23.demo1.Car;
import com.javacode2021.lesson23.demo1.User;
import com.javacode2021.lesson23.demo2.Service1;
import com.javacode2021.lesson23.demo2.Service2;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2022/5/16 20:52
 **/
public class LifeCycle {

    @Test
    public void test1(){
        /** 指定class */
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Car.class.getName());
        /** 获取BeanDefinition */
        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        System.out.println(beanDefinition);
    }

    @Test
    public void test2(){
        /** 指定class */
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Car.class.getName());
        /** 设置普通类型属性 */
        beanDefinitionBuilder.addPropertyValue("name", "奥迪"); //@1
        /** 获取BeanDefinition */
        BeanDefinition carBeanDefinition = beanDefinitionBuilder.getBeanDefinition();
        System.out.println(carBeanDefinition);

        /** 创建spring容器 */
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); //@2
        /** 调用registerBeanDefinition向容器 */
        factory.registerBeanDefinition("car", carBeanDefinition); //@3
        Car bean = factory.getBean("car", Car.class); //@4
        System.out.println(bean);
    }

    @Test
    public void test3(){
        /** 先创建car这个BeanDefinition */
        BeanDefinition carBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Car.class.getName())
                .addPropertyValue("name","路虎")
                .getBeanDefinition();
        /** 创建User这个BeanDefinition */
        BeanDefinition userBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(User.class.getName())
                .addPropertyValue("name", "路人甲Java")
                .addPropertyReference("car", "car")
                .getBeanDefinition();
        /** 创建spring容器 */
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        /** 调用registerBeanDefinition向容器中注册bean */
        factory.registerBeanDefinition("car", carBeanDefinition);
        factory.registerBeanDefinition("user", userBeanDefinition);
        System.out.println(factory.getBean("car"));
        System.out.println(factory.getBean("user"));
    }

    @Test
    public void test4(){
        /** 先创建car这个BeanDefinition */
        BeanDefinition carBeanDefinition1 = BeanDefinitionBuilder.
                genericBeanDefinition(Car.class)
                .addPropertyValue("name", "保时捷")
                .getBeanDefinition();
        BeanDefinition carBeanDefinition2 = BeanDefinitionBuilder.
                genericBeanDefinition() //内部生成一个GenericBeanDefinition对象
                .setParentName("car1") //@1：设置父bean的名称为car1
                .getBeanDefinition();
        //创建spring容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //调用registerBeanDefinition向容器中注册bean
        //注册car1->carBeanDefinition1
        factory.registerBeanDefinition("car1", carBeanDefinition1);
        //注册car2->carBeanDefinition2
        factory.registerBeanDefinition("car2", carBeanDefinition2);
        //从容器中获取car1
        System.out.println(String.format("car1->%s", factory.getBean("car1")));
        //从容器中获取car2
        System.out.println(String.format("car2->%s", factory.getBean("car2")));
    }

    /**
     * xml方式bean配置信息解析
     */
    @Test
    public void test5(){
        /** 定义一个spring容器，这个容器默认实现了BeanDefinitionRegistry，所以本身就是一个bean注册器 */
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        /** 定义一个xml的BeanDefinition读取器，需要传递一个BeanDefinitionRegistry（bean注册器）对象 */
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);

        /** 指定bean xml配置文件的位置 */
        String location = "classpath:/com/javacode2021/lesson23/demo2/beans.xml";
        /** 通过XmlBeanDefinitionReader加载bean xml文件，然后将解析产生的BeanDefinition注册到容器容器中 */
        int countBean = xmlBeanDefinitionReader.loadBeanDefinitions(location);
        System.out.println(String.format("共注册了 %s 个bean", countBean));

        /** 打印出注册的bean的配置信息 */
        for (String beanName : factory.getBeanDefinitionNames()) {
            /** 通过名称从容器中获取对应的BeanDefinition信息 */
            BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
            /** 获取BeanDefinition具体使用的是哪个类 */
            String beanDefinitionClassName = beanDefinition.getClass().getName();
            /** 通过名称获取bean对象 */
            Object bean = factory.getBean(beanName);
            /** 打印输出 */
            System.out.println(beanName + ":");
            System.out.println("    beanDefinitionClassName：" + beanDefinitionClassName);
            System.out.println("    beanDefinition：" + beanDefinition);
            System.out.println("    bean：" + bean);
        }
    }

    /**
     * properties文件方式bean配置信息解析
     **/
    @Test
    public void test6(){
        /** 定义一个spring容器，这个容器默认实现了BeanDefinitionRegistry，所以本身就是一个bean注册器 */
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        /** 定义一个xml的BeanDefinition读取器，需要传递一个BeanDefinitionRegistry（bean注册器）对象 */
        PropertiesBeanDefinitionReader propertiesBeanDefinitionReader = new PropertiesBeanDefinitionReader(factory);

        /** 指定bean xml配置文件的位置 */
        String location = "classpath:/com/javacode2021/lesson23/demo2/beans.properties";
        /** 通过XmlBeanDefinitionReader加载bean xml文件，然后将解析产生的BeanDefinition注册到容器容器中 */
        int countBean = propertiesBeanDefinitionReader.loadBeanDefinitions(location);
        System.out.println(String.format("共注册了 %s 个bean", countBean));

        /** 打印出注册的bean的配置信息 */
        for (String beanName : factory.getBeanDefinitionNames()) {
            /** 通过名称从容器中获取对应的BeanDefinition信息 */
            BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
            /** 获取BeanDefinition具体使用的是哪个类 */
            String beanDefinitionClassName = beanDefinition.getClass().getName();
            /** 通过名称获取bean对象 */
            Object bean = factory.getBean(beanName);
            /** 打印输出 */
            System.out.println(beanName + ":");
            System.out.println("    beanDefinitionClassName：" + beanDefinitionClassName);
            System.out.println("    beanDefinition：" + beanDefinition);
            System.out.println("    bean：" + bean);
        }
    }

    @Test
    public void test7(){
        /** 定义一个spring容器，这个容器默认实现了BeanDefinitionRegistry，所以本身就是一个bean注册器 */
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        /** 定义一个注解方式的BeanDefinition读取器，需要传递一个BeanDefinitionRegistry（bean注册器）对象 */
        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(factory);

        /** 通过PropertiesBeanDefinitionReader加载bean properties文件，然后将解析产生的BeanDefinition注册到容器容器中 */
        annotatedBeanDefinitionReader.register(Service1.class, Service2.class);

        /** 打印出注册的bean的配置信息 */
        for (String beanName : new String[]{"service1", "service2"}) {
            /** 通过名称从容器中获取对应的BeanDefinition信息 */
            BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
            /** 获取BeanDefinition具体使用的是哪个类 */
            java.lang.String beanDefinitionClassName = beanDefinition.getClass().getName();
            /** 通过名称获取bean对象 */
            Object bean = factory.getBean(beanName);
            /** 打印输出 */
            System.out.println(beanName + ":");
            System.out.println("    beanDefinitionClassName：" + beanDefinitionClassName);
            System.out.println("    beanDefinition：" + beanDefinition);
            System.out.println("    bean：" + bean);
        }
    }

    @Test
    public void test8(){
        /** 定义一个spring容器，这个容器默认实现了BeanDefinitionRegistry，所以本身就是一个bean注册器 */
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        /** 定义一个注解方式的BeanDefinition读取器，需要传递一个BeanDefinitionRegistry（bean注册器）对象 */
        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(factory);

        /** 通过PropertiesBeanDefinitionReader加载bean properties文件，然后将解析产生的BeanDefinition注册到容器容器中 */
        annotatedBeanDefinitionReader.register(Service1.class, Service2.class);

        factory.getBeansOfType(BeanPostProcessor.class).values().forEach(factory::addBeanPostProcessor); //@1

        /** 打印出注册的bean的配置信息 */
        for (String beanName : new String[]{"service1", "service2"}) {
            /** 通过名称从容器中获取对应的BeanDefinition信息 */
            BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
            /** 获取BeanDefinition具体使用的是哪个类 */
            java.lang.String beanDefinitionClassName = beanDefinition.getClass().getName();
            /** 通过名称获取bean对象 */
            Object bean = factory.getBean(beanName);
            /** 打印输出 */
            System.out.println(beanName + ":");
            System.out.println("    beanDefinitionClassName：" + beanDefinitionClassName);
            System.out.println("    beanDefinition：" + beanDefinition);
            System.out.println("    bean：" + bean);
        }
    }
}
