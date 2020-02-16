package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/6 10:45
 */
public class Demo1 extends Father {
    public String name="demo1";
    public static void main(String[] args) {
        Father demo1=new Demo1();
        System.out.println(demo1.getName());
    }
}
class Father{
    public String name="father";
    public String getName(){
        return name;
    }
}
