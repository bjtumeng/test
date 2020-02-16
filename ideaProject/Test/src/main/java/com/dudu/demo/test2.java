package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/17 15:24
 */
public class test2 {
    public static void main(String[] args) {
        int func = func();
       double a=4.0;
       double b=3.6;
        System.out.println(a-b);
        System.out.println(func);
    }
    public static int func(){
        try{
            return 1;
        }catch(Exception e){
            return 2;
        }finally{
            return 3;
        }
    }
}
