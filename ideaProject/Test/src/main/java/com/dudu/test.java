package com.dudu;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/18 14:17
 */
public class test {
    public static void main(String []args){
        test  s =new test();
        s.start();
    }
    private void start(){
        int a=4;
        int b=5;
        System.out.print(" "+6+9+" ");
        System.out.print(a+b);
        System.out.print(" "+a+b+" ");
        System.out.print(test()+a+b+" ");
        System.out.print(a+b+test());
    }
    private String test(){
        return "foo";
    }
}