package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/6 17:27
 */
public class demo2 {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        call_array(array[0],array);
        System.out.println(array[0]+","+array[1]);
    }
    static void call_array(int i,int[] array){
       array[i]=6;
       i=5;
    }
}
