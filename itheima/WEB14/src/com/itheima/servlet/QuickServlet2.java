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
 * @Date: Created in 21:31 2018/4/17
 * @Modified By:
 */
@WebServlet(name = "ServletTest",value="/ServletTest")
public class QuickServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dopost running");
        request.getRequestDispatcher("/servlet1").forward(request,response);
//          response.sendRedirect(request.getContextPath()+"/servlet1");
    }
}
