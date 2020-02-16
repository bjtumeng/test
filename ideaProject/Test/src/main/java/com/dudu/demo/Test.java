package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/14 20:50
 */
public class Test{
    public static void main(String[] args) {
        String s1="abc"+"def";
        String s2=new String (s1);
        if(s1==s2){
            System.out.println("==succeeded");
        }
        if (s1.equals(s2)){
            System.out.println("zhixing");
        }
    }


}
