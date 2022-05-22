package com.javacode2021.lesson23;

import com.javacode2021.lesson23.demo1.Car;
import com.javacode2021.lesson23.demo5.UserModel;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @description: bean初始化前阶段，会调用：{@link org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor#postProcessBeforeInitialization(Object, String)}
 * @Author guanqing
 * @Date 2022/5/20 8:46
 **/
public class InstantiationAwareBeanPostProcessorTest {
    @Test
    public void test1(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        /** 添加一个BeanPostProcessor：InstantiationAwareBeanPostProcessor */
        factory.addBeanPostProcessor(new InstantiationAwareBeanPostProcessor() { //@1
            @Override
            public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
                System.out.println("调用postProcessBeforeInstantiation()");
                /** 发现类型是Car类型的时候，硬编码创建一个Car对象返回 */
                if (beanClass == Car.class) {
                    Car car = new Car();
                    car.setName("保时捷");
                    return car;
                }
                return null;
            }
        });

        /** 定义一个car bean,车名为：奥迪 */
        AbstractBeanDefinition carBeanDefinition = BeanDefinitionBuilder
                .genericBeanDefinition(Car.class)
                .addPropertyValue("name", "奥迪") //@2
                .getBeanDefinition();
        factory.registerBeanDefinition("car", carBeanDefinition);
        /** 从容器中获取car这个bean的实例，输出 */
        System.out.println(factory.getBean("car"));
    }

    /**
     * {@link InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation(java.lang.Object, java.lang.String)}
     *  * 返回false，可以阻止bean属性的赋值
     */
    @Test
    public void test2(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.addBeanPostProcessor(new InstantiationAwareBeanPostProcessor() {
            @Override
            public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
                if ("user1".equals(beanName)){
                    return false;
                } else {
                    return true;
                }
            }
        });

        factory.registerBeanDefinition("user1", BeanDefinitionBuilder
                .genericBeanDefinition(UserModel.class)
                .addPropertyValue("name", "路人甲Java")
                .addPropertyValue("age", 30)
                .getBeanDefinition());

        factory.registerBeanDefinition("user2", BeanDefinitionBuilder
                .genericBeanDefinition(UserModel.class)
                .addPropertyValue("name","刘德华")
                .addPropertyValue("age", 50)
                .getBeanDefinition());

        for (String beanName : factory.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, factory.getBean(beanName)));
        }
    }

    @Test
    public void test3(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        factory.addBeanPostProcessor(new InstantiationAwareBeanPostProcessor() {
            @Override
            public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
                if ("user1".equals(beanName)){
                    if (pvs == null){
                        pvs = new MutablePropertyValues();
                    }
                    if (pvs instanceof MutablePropertyValues){
                        MutablePropertyValues mpvs = (MutablePropertyValues) pvs;
                        /** 将姓名设置为：路人 */
                        mpvs.add("name", "路人");
                        /** 将年龄属性的值修改为18 */
                        mpvs.add("age", 18);
                    }
                }
                return null;
            }
        });

        /** 注意 user1 这个没有给属性设置值 */
        factory.registerBeanDefinition("user1", BeanDefinitionBuilder
                .genericBeanDefinition(UserModel.class)
                .getBeanDefinition()); //@1

        factory.registerBeanDefinition("user2", BeanDefinitionBuilder
                .genericBeanDefinition(UserModel.class)
                .addPropertyValue("name","刘德华")
                .addPropertyValue("age", 50)
                .getBeanDefinition());

        for (String beanName : factory.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, factory.getBean(beanName)));
        }
    }
}
