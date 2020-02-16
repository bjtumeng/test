package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/6 17:39
 */
public class demo3 {
    private static int j=0;
    private static Boolean methodB(int k){
        j+=k;
        return true;
    }
    private static void methodA(int i){
     boolean b;
     b=i<10|methodB(4);
     b=i<10||methodB(8);
    }

    public static void main(String[] args) {
        methodA(0);

        System.out.println(j);
    }
}
