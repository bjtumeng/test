package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/4 15:52
 */
public abstract class M{
    public int i=5;
//  A:  i=i+5;  在类中不能这样写，在方法中可以
//  B:  public abstract void method(int b);  正确，是重载，参数列表不同
//  C:  public int method(){ return 3;}   不是重载，只是单纯返回值不同
   public void method(){ }
}
