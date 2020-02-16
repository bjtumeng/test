package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/7 12:10
 */
public class Demo12 {
   static{
       System.out.println("Demo12 init");
   }
    {
        System.out.println("Demo12 method");
    }
    public Demo12(){
        System.out.println("构造方法");
    }
   public static final int num=3;
  public static void hello(){
      System.out.println("static method");
  }
    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("com.dudu.demo.Demo12");
//        Demo12 demo12=new Demo12();
        System.out.println(Demo12.num);
    }
}
