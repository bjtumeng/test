package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2019/3/11 21:18
 */
public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();//主线程中启动另外一个线程
       System.out.println("b is start....");
        synchronized(b) {
            try {
                System.out.println("Waiting for b to complete...");
                b.wait();//这一句是什么意思，究竟谁等待?
             System.out.println("ThreadB is Completed. Now back to main thread");
            }catch (InterruptedException e){}
        }
        System.out.println("Total is :" + b.total);
    }
}

class ThreadB extends Thread {
    int total;
    @Override
    public void run() {
        synchronized(this) {
            System.out.println("ThreadB is running..");
            for (int i=0; i<=100; i++ ) {
                total += i;
            }
            System.out.println("total is " + total);
            notify();
        }
    }
}
