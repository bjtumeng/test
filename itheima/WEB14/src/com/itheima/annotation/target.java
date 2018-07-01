package com.itheima.annotation;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:20 2018/6/30
 * @Modified By:
 */
public class target implements TargetInterface {
    @Override
    public void method1() {
        System.out.println("method1 running......");
    }

    @Override
    public String method2() {
        return "method2";
    }

    @Override
    public int method3(int x) {
        return x;
    }
}
