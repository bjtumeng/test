package com.itheima.AccesServlet;

import sun.util.calendar.LocalGregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:28 2018/5/19
 * @Modified By:
 */
@WebServlet(name = "sendCookieServlet",value="/sendCookie")
public class sendCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date=new Date();
//        long time = date.getTime();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");
        String dates=dateFormat.format(date);
        System.out.println(dates);
        //第一次访问设置Cookie
        Cookie cookie=new Cookie("lastAccessTime",dates);
        cookie.setMaxAge(60*60*24*365);
        response.addCookie(cookie);
        System.out.println();
    }
}
