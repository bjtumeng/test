package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2019/4/22 20:07
 */
public class Thread2 implements  Runnable{
    Num num;
   public Thread2(Num num){
       this.num=num;
    }
    @Override
    public void run() {
        while(num.i<100){
            synchronized (num){
                if (num.flag){
                    try{
                        num.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("我是线程2"+"  "+num.i);
                    num.i++;
                    num.flag=true;
                    num.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Num num =new Num();
        Thread1 thread1=new Thread1(num);
        Thread2 thread2=new Thread2(num);
        Thread thread3=new Thread(thread1);
        Thread thread4=new Thread(thread2);
        thread3.start();
        thread4.start();
    }
}
class Num{
    int i=1;
    boolean flag=true;
}