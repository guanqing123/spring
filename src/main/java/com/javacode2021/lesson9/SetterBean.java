package com.javacode2021.lesson9;

import org.springframework.beans.factory.DisposableBean;

/**
 * @description: 强依赖的bean的创建和销毁顺序
 * @Author guanqing
 * @Date 2021/12/15 22:05
 **/
public class SetterBean {
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

        private Bean1 bean1;

        public void setBean1(Bean1 bean1) {
            System.out.println("bean2 注入 bean1");
            this.bean1 = bean1;
        }

        public Bean2() { //@1
            System.out.println(this.getClass() + " constructor!");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + " destory()");
        }
    }

    public static class Bean3 implements DisposableBean {

        private Bean2 bean2;

        public void setBean2(Bean2 bean2) {
            System.out.println("bean3 注入 bean2");
            this.bean2 = bean2;
        }

        public Bean3() {
            System.out.println(this.getClass() + " constructor!");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + " destory()");
        }
    }
}
