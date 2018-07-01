package com.itheima.web;

import com.itheima.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:24 2018/6/26
 * @Modified By:
 */
@WebServlet(name = "ModifyIndexServlet",value="/moindex")
public class ModifyIndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
//        userInfo = (User)session.getAttribute("userInfo");
    }
}
