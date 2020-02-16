package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/17 22:47
 */
public class Test3 {
    public static void main(String[] args) {
        test("aa");
    }
    public static void test(String... books){
        System.out.println("aaa");
    }
    public static void test(String books){
        System.out.println("bbb");
    }
}
