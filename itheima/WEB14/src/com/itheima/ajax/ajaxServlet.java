package com.itheima.ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:40 2018/6/16
 * @Modified By:
 */
@WebServlet(name = "ajaxServlet",value="/ajax")
public class ajaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("{\"name\":\"张三\"}");
        int i=1/0;
        System.out.println(name);
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
