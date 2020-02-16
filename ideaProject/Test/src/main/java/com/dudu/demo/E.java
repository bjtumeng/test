package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/4 15:38
 */
public class E {
    public static void main(String[] args) {
        //创建对象
        F tool = new F();
        //调用方法,传入的参数是什么类型,返回值就是什么类型
        tool.show("hello");
        tool.show(12);
        tool.show(12.5);

    }
}
