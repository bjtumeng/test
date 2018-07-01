package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 19:44 2018/6/26
 * @Modified By:
 */
@WebServlet(name = "AutoLoginServlet",value="/AutoLogin")
public class AutoLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService userService=new UserService();
        User user=null;
            try {
            user=userService.login(username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

       if(user!=null){
           //1.判断是否选择自动登录,假如选择自动登录,创建Cookie存username和password
           //并且写回到客户端
           String checkbox = request.getParameter("checkbox");
           if(checkbox!=null){
               Cookie cookie_username=new Cookie("cookie_username",username);
               Cookie cookie_password=new Cookie("cookie_password",password);
               //设置cookie的持久化时间
               cookie_password.setMaxAge(60*60);
               cookie_username.setMaxAge(60*60);
               cookie_password.setPath(request.getContextPath());
               cookie_username.setPath(request.getContextPath());
               response.addCookie(cookie_username);
               response.addCookie(cookie_password);
           }
              session.setAttribute("userInfo",user);
              response.sendRedirect(request.getContextPath());
       }else{
           request.setAttribute("loginInfo","用户名或密码错误");
           request.getRequestDispatcher("/login.jsp").forward(request,response);
       }
    }
}
