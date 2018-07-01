package com.itheima.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 17:20 2018/6/30
 * @Modified By:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyAnno {
//    注解的属性
    String name();
    int age() default 28;
}
