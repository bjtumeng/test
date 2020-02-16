package com.dudu.demo;
import org.junit.*;
import org.junit.Test;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/25 21:50
 */
public class FunctionInterfaceTest {
    @org.junit.Test
    public static void Lambda(){
        func(()->System.out.println("完成测试"));
    }
    public static void func(FunctionInterface functionInterface){
       functionInterface.test();
    }
    @Test
    public static void LambdaTest(){
        func(new FunctionInterface() {
            @Override
            public void test() {
                System.out.println("原始方式完成测试");
            }
        });
    }

    public static void main(String[] args) {
        Lambda();
        LambdaTest();
    }
}
