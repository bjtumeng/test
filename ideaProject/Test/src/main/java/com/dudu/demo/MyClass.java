package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/18 21:21
 */
public class MyClass {
    int i=-1;
    private void action(){
        int i=0;
        i++;
    }
    public static void main(String[] args){
        MyClass mc=new MyClass();
        mc.action();
        System.out.println(mc.i);
    }
}
