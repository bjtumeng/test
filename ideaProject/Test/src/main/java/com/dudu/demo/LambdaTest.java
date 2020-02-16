package com.dudu.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/25 20:57
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("1","2","3","4","5","6");
        System.out.println("----普通的for循环--------------");
        for (String str:list) {
            System.out.println(str);
        }
        System.out.println("----lambda表达式--------------");
        list.forEach(str -> System.out.println(str));
    }
}
