package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/4 15:39
 */
public class K extends F {
    public static void main(String[] args) {
      Integer i=42;
      Long l=42L;
      Double d=42.0;
        double dd=42.0;
        Integer int04=235;
        Integer int05=235;
//        System.out.println(i==d);
//      System.out.println(i==l);
//      System.out.println(i==d);
//      System.out.println(l==d);
        System.out.println(l==dd);
      System.out.println(i.equals(d));
      System.out.println(d.equals(l));
      System.out.println(i.equals(l));
      System.out.println(l.equals(42L));
    }
}
