package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/18 21:39
 */
public class A {
//    void callme(){
//        System.out.println("A");
//    }
}
class B extends A{
//    @Override
//    void callme(){
//        System.out.println("B");
//    }
}
class C extends B{
//    @Override
//    void callme(){
//        System.out.println("D");
//    }
public static void main(String[] args) {
    A a1=new A();
    A a2=new B();
    A a3=new C();

}
}
