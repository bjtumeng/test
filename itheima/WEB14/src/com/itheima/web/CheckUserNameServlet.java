package com.itheima.web;

import com.itheima.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:20 2018/6/17
 * @Modified By:
 */
@WebServlet(name = "CheckUserNameServlet",value="/checkUsername")
public class CheckUserNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        UserService userService=new UserService();
        Boolean isExit = null;
        try {
            isExit = userService.CheckUsername(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.getWriter().write("{\"isExit\":"+isExit+"}");
    }
}
