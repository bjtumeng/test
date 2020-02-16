package com.dudu.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/19 22:25
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("1");
        al.add("2");
        al.add("3");
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------迭代器---------");
        for (String ss:al){
            System.out.println(ss);
        }
        System.out.println("-----增强for循环---------");
        for (int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("------普通for循环----------");
        String[] s=new String[10];
        System.out.println(s[10]);
        long k=32;
        String[] temp=new String[]{"111","bbb"};
    }
}
