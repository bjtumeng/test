package com.dudu.demo;

/**
 * @author zhaomeng
 * @Description:
 * @date 2020/2/6 22:25
 */
public class Demo9 {

    public static void main(String[] args) {

        weekday mon = weekday.mon;
        weekday tue = weekday.tue;
        weekday thus = weekday.thus;
        weekday fri = weekday.fri;

    }

    public enum weekday {
        mon(), tue(2), wes(3), thus(), fri;
        private weekday() {
            System.out.println("no args");
        }

        private weekday(int i) {
            System.out.println("have args " + i);
        };
    }
}
