package com.itheima.annotation;

import org.junit.Test;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:23 2018/6/30
 * @Modified By:
 */
public class proxyTest {
    @Test
   public void method(){
        //o是代理对象,根据参数确定是谁的代理对象
        TargetInterface o = (TargetInterface) Proxy.newProxyInstance(
                target.class.getClassLoader(),   //与目标对象相同的类加载器
                new Class[]{TargetInterface.class}, //目标对象的接口数组
                new InvocationHandler() {
                    @Override
                    //实际调用者调用的代理对象的invoke
                    //method代表目标对象的字节码对象,args目标对象的参数
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行目标方法前的逻辑");
                        //执行目标对象的方法
                        Object invoke = method.invoke(new target(), args);
                        System.out.println("执行目标方法后的逻辑");
                        return invoke;
                    }
                }
        );
        o.method1();
    }
}
