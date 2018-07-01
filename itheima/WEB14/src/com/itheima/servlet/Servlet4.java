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
 * @Date: Created in 21:59 2018/5/13
 * @Modified By:
 */
@WebServlet(name = "Servlet4",value="/servlet4")
public class Servlet4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object name = request.getAttribute("name");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("请求转发"+name);
    }
}
