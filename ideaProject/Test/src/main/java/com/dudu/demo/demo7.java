package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/6 20:51
 */
public class demo7 {
    public static int num=5;
    public int num1=3;
    public void show(){
        System.out.println("非静态方法"+num);
    }
    public static void print(){
//        System.out.println("静态方法"+num+"--"+num1);
    }
    public static void main(String[] args) {
       demo7 demo7=new demo7();
       demo7.show();
       print();
    }
}
