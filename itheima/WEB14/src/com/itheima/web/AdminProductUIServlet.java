package com.itheima.web;

import com.itheima.domain.Category;
import com.itheima.service.AdminProductUIService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:15 2018/6/5
 * @Modified By:
 */
@WebServlet(name = "AdminProductUIServlet",value="/adminProductUI")
public class AdminProductUIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdminProductUIService adminProductUIService=new AdminProductUIService();
        List<Category> category = null;
        try {
            category = adminProductUIService.findAllCategory();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("category",category);
        System.out.println(category);
        request.getRequestDispatcher("/admin/product/add.jsp").forward(request,response);

    }
}
