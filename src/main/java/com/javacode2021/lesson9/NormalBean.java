package com.javacode2021.lesson9;

import org.springframework.beans.factory.DisposableBean;

/**
 * @description: TODO 无任何依赖的bean创建的顺序
 * @Author guanqing
 * @Date 2021/12/15 22:05
 **/
public class NormalBean {
    public static class Bean1 implements DisposableBean {

        public Bean1() {
            System.out.println(this.getClass() + " constructor!");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + " destory()");
        }
    }

    public static class Bean2 implements DisposableBean {

        public Bean2() {
            System.out.println(this.getClass() + " constructor!");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + " destory()");
        }
    }

    public static class Bean3 implements DisposableBean {

        public Bean3() {
            System.out.println(this.getClass() + " constructor!");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + " destory()");
        }
    }
}
