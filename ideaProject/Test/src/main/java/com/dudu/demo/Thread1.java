package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2019/4/22 20:05
 */
public class Thread1 implements Runnable {
    Num num;
    public Thread1(Num num){
        this.num=num;
    }
    @Override
    public void run() {
        while(num.i<100){
            synchronized (num){
                if (!num.flag){
                    try{
                        num.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("我是线程1"+"  "+num.i);
                    num.i++;
                    num.flag=false;
                    num.notify();
                }
            }
        }
    }
}
