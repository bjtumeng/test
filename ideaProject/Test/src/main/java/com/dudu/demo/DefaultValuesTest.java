package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/18 21:25
 */
public class DefaultValuesTest {
    int [] ia=new int[1];
    boolean b;
    int i;
    Object object;

    public static void main(String[] args) {
        DefaultValuesTest defaultValuesTest=new DefaultValuesTest();
        defaultValuesTest.print();
    }
    public void print(){
        System.out.println(ia[0]+" "+b+" "+object);
    }
}
