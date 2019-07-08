package com.itheima.annotation;

import java.lang.reflect.Method;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 17:37 2018/6/30
 * @Modified By:
 */
public class MyAnnoParser {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<MyAnnoTest> classzz = MyAnnoTest.class;
        Method show = classzz.getMethod("show");
        MyAnno annotation = show.getAnnotation(MyAnno.class);
        System.out.println(annotation.age());
    }
}
