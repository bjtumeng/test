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
 * @Date: Created in 20:32 2018/5/19
 * @Modified By:
 */
@WebServlet(name = "RevCookieServlet",value = "/revCookie")
public class RevCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String cookieValue=null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("lastAccessTime")) {
                    cookieValue = cookie.getValue();
                }
            }
        }
        response.setContentType("text/html;charset=UTF-8");
        if (cookieValue == null) {
            response.getWriter().write("这是第一次访问");
        } else {
            response.getWriter().write("上次访问时间：" + cookieValue);
        }
    }
}
