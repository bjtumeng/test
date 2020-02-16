package com.dudu.demo;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/19 22:19
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("1");
        hs.add("2");
        hs.add("3");
        for (String ss:hs){
            System.out.println(ss);
        }
    }
}
