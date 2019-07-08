package com.itheima.Listener; /**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:08 2018/6/21
 * @Modified By:
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@WebListener()
public class MyServletContextListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    public MyServletContextListener() {
    }

  @Override
    public void contextInitialized(ServletContextEvent sce) {
        String currentime ="2018-6-21 22:59:00";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date =null;
        try {
            date = simpleDateFormat.parse(currentime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("开始计息了");
            }
        },date,24*60*60*1000);
        System.out.println("servletContext启动了");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext销毁了.....");
    }
    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {

    }
    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {

    }
    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {

    }
}
