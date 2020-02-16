package com.dudu.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/19 19:25
 */
public class IteratorTest {
    public static void main(String[] args) {
        List books =new ArrayList();
        books.add("1");
        books.add("2");
        books.add("3");
        Iterator it =books.iterator();
        while(it.hasNext()){
//            Integer next = (Integer) it.next();
//            if (next==1){
//                it.remove();
//            }
//            //迭代器只是拿的值,不是拿的地址
//            next=5;
            String item = (String)it.next();
            if (item.equals("1")){
                it.remove();    //报错！！！
            }

            }
        }
    }
