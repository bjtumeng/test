package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:41 2018/5/12
 * @Modified By:
 */
@WebServlet(name = "ContentServlet",value="/content")
public class ContentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1.获得单个值
        String username = request.getParameter("username");
//        System.out.println(username);
//        2.获得多个值
        String password = request.getParameter("password");
//        System.out.println(password);
        String[] hobbies = request.getParameterValues("hobby");
//

//       3.获得所有参数封装到Map<String,String[]>中
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (Map.Entry<String,String[]> entry:parameterMap.entrySet()){
          System.out.println(entry.getKey());
          for (String str:entry.getValue()){
          System.out.println(str);
          }
        }
    }
}
