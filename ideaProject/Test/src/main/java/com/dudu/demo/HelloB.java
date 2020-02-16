package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/18 23:36
 */
public class HelloB extends HelloA {
    public HelloB() {
        System.out.println("HelloB");
    }
    {
        System.out.println("B class");
    }
    static{
        //2
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
