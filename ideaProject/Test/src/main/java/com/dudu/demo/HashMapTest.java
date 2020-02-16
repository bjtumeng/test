package com.dudu.demo;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/19 22:11
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<String, String>();
        hm.put("1","张三");
        hm.put("2","张三2");
        hm.put("3","张三3");
        //hm.keySet()返回该Map所有key组成的set集合
        for (String key:hm.keySet()){
            System.out.println(key+"->"+hm.get(key));
        }
        System.out.println("-----使用增强for循环---------");
        Iterator it=hm.keySet().iterator();
        while(it.hasNext()){
            String next = it.next().toString();
            System.out.println(next+"->"+hm.get(it.next().toString()));
        }
    }
}
