package com.itheima.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 17:09 2018/6/30
 * @Modified By:
 */
public class AnnoDemo {
    public static void main(String[] args) {
        List list=new ArrayList();
        show();
    }
    @Deprecated
    public static void show(){

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
