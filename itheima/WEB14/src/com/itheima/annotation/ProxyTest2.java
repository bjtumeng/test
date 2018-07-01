package com.itheima.annotation;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:52 2018/6/30
 * @Modified By:
 */
public class ProxyTest2 {
    public static void main(String[] args) {
        final target target=new target();
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    //代理对象找接口的方法,都是使用invoke
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object invoke = method.invoke(target, args);
                        //return返回值给代理对象
                        return invoke;
                    }
                }
        );
       proxy.method1();
        proxy.method3(100);
    }
}
