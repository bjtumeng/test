package com.itheima.ClassLoader;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.net.URL;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 16:19 2018/6/30
 * @Modified By:
 */
public class Demo {
    public static void main(String[] args) {
        //获得类加载器
        ClassLoader classLoader = Demo.class.getClassLoader();
        //获得classes(src)下的任何资源
        String path = classLoader.getResource("jdbc.properties").getPath();
        System.out.println(classLoader);
        System.out.println(path);
    }
}
