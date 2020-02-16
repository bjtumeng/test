package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/12/18 8:21
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
