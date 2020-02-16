package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/6 18:36
 */
public class demo6 {
    public static demo6 tl = new demo6();
    public static demo6 t2 = new demo6();

    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }

    public static void main(String[] args){
        demo6 t = new demo6();
    }
}
