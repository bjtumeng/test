package com.itheima.TestListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:10 2018/6/21
 * @Modified By:
 */
public class MyServletcontextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext创建......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext销毁......");
    }
}
