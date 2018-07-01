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
 * @Date: Created in 20:44 2018/5/12
 * @Modified By:
 */
@WebServlet(name = "RefererServlet",value="/referer")
public class RefererServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        对该新闻来源分析
        String referer = request.getHeader("referer");
        if(referer!=null&&referer.startsWith("http://localhost")){
//            是从本网站跳出去的
            response.setContentType("text/html;charset=UTF-8");
         response.getWriter().write("中国共拿到100块金牌");
        }else{
//           不是从本网站跳出去的
            response.getWriter().write("你是盗链者");
        }
    }
}
