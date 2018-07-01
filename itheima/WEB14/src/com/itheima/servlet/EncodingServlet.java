package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:05 2018/6/27
 * @Modified By:
 */
@WebServlet(name = "EncodingServlet",value = "/encodingServlet")
public class EncodingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
//        username= URLEncoder.encode(username,"UTF-8");
//        username= URLDecoder.decode(username,"UTF-8");
//       String  user = new String(username.getBytes("iso8859-1"), "UTF-8");
        System.out.println(username);
    }
}
