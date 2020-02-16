package com.dudu.demo;

import java.util.Date;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/14 21:46
 */
public class SuperTest extends Date {
    private static final long serialVersionUID = 1L;
    private void test() {
        System.out.println(super.getClass());
    }
        public static void main(String[] args){
            new SuperTest().test();
        }
}