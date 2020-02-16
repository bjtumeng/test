package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/7 18:27
 */
public class Demo13 {
    static void func(String ss){
        ss="world";
    }
    static void funcBuffer(StringBuffer ss){
        ss.append("world");
    }
    public static void main(String[] args) {
        String s="hello";
        func(s);
        System.out.println(s);    //hello
        StringBuffer sb=new StringBuffer("hello");
        funcBuffer(sb);
        System.out.println(sb);   //helloworld
    }
}
