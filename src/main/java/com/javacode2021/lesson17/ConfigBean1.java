package com.javacode2021.lesson17;

import org.springframework.context.annotation.Bean;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/28 8:43
 **/
public class ConfigBean1 {
    /** bean名称为方法默认值: user1 */
    @Bean
    public User user1(){
        return new User();
    }

    /** bean名称通过value指定了: user2Bean */
    @Bean("user2Bean")
    public User user2(){
        return new User();
    }

    /** bean名称为：user3Bean, 2个别名: [user3BeanAlias1,user3BeanAlias2] */
    @Bean({"user3Bean", "user3BeanAlias1", "user3BeanAlias2"})
    public User user3(){
        return new User();
    }
}
