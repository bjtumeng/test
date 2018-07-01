package com.itheima.AccesServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 15:07 2018/5/20
 * @Modified By:
 */
@WebServlet(name = "RemovCookieServlet",value="/removCookie")
public class RemovCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Cookie cookie=new Cookie("lastAccessTime","");
       cookie.setMaxAge(0);
       response.addCookie(cookie);
    }
}
