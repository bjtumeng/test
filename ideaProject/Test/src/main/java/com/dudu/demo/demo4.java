package com.dudu.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/6 17:48
 */
public class demo4 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList();
        list1.add(0);
        List list2=list1;
        System.out.println(list1.get(0) instanceof Integer);
        System.out.println(list2.get(0) instanceof Integer);
    }
}
