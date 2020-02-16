package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/14 22:14
 */
public class Base {
    private String baseName = "base";

    public Base() {
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    static class Sub extends Base {
        private String baseName ="sub";
@Override
        public void callName() {
            System.out.println(super.baseName);
        }
            public static void main (String[]args){
                Base b = new Sub();
            }
        }
}