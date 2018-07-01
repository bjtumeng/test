package com.itheima.web;

import com.itheima.service.AdminProductService;

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
 * @Date: Created in 19:36 2018/6/7
 * @Modified By:
 */
@WebServlet(name = "AdminDelProductServlet",value="/adminDelProduct")
public class AdminDelProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取pid
        String pid = request.getParameter("pid");
        System.out.println(pid);
        //2.传递参数
        AdminProductService adminProductService =new AdminProductService();
        try {
            adminProductService.delProductByPid(pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect(request.getContextPath()+"/adminProductList");
    }
}
