package com.dudu.demo;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author zhaomeng
 * @Description:
 * @date 2018/11/19 23:02
 */
public class Main {
    public static void show() {
        // 定义方法内部类
        class MInner {
            int score = 83;
            public int getScore() {
                return score + 10;
            }
        }
        MInner mi=new MInner();    // 创建方法内部类的对象
        int newScore=  mi.getScore();// 调用内部类的方法
        System.out.println(newScore);
    }

    public static void main(String[] args) {
        show();
    }
}
