package com.itheima.Listener; /**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 10:51 2018/6/23
 * @Modified By:
 */

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class MyServletContextAttributeListener implements ServletContextAttributeListener{


    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println(servletContextAttributeEvent.getName());
        System.out.println(servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println(servletContextAttributeEvent.getName());
        System.out.println(servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        //监听修改前域的名字
        System.out.println(servletContextAttributeEvent.getName());
        //监听修改前域的值
        System.out.println(servletContextAttributeEvent.getValue());
    }
}
