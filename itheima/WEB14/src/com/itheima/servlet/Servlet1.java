package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:04 2018/4/24
 * @Modified By:
 */
@WebServlet(name = "Servlet1",value="/servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//             1.设置状态码
//        response.setStatus(302);
//             2.设置跳转地址
//        response.setHeader("Location","/WEB14/servlet2");
//        response.sendRedirect("/WEB14/servlet2");
        response.getWriter().write("....");
    }
}
