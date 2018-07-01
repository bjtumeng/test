package com.itheima.SessionServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 14:39 2018/5/20
 * @Modified By:
 */
@WebServlet(name = "Session1",value="/session1")
public class Session1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("name","zhaomeng");
        String id = session.getId();
        Cookie cookie=new Cookie("JSESSIONID",id);
        cookie.setMaxAge(10*60*365);
//        cookie.setPath("/WEB14");
        response.addCookie(cookie);
    }
}
