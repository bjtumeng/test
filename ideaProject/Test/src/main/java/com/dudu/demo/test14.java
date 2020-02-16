package com.dudu.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/20 8:19
 */
public class test14 {
    public static void main(String[]args){
        List<String> s=new ArrayList<String>();
        s.add("lo");
        for(int i=0;i<s.size();i++){
            String str=s.get(i);
            System.out.println(str);
        }
    }
}
