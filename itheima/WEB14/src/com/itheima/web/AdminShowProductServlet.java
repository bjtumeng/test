package com.itheima.web;

import com.itheima.domain.Category;
import com.itheima.domain.Product;
import com.itheima.service.AdminProductUIService;
import com.itheima.service.AdminProductService;

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
 * @Date: Created in 20:55 2018/6/7
 * @Modified By:
 */
@WebServlet(name = "AdminShowProductServlet",value = "/adminShowProduct")
public class AdminShowProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //1、准备数据
        String pid = request.getParameter("pid");
        System.out.println(pid);
        AdminProductService adminProductService =new AdminProductService();
        Product productByPid = null;
        try {
            productByPid = adminProductService.findProductByPid(pid);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        AdminProductUIService adminProductUIService=new AdminProductUIService();
        List<Category> category = null;
        try {
            category = adminProductUIService.findAllCategory();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("category",category);
        //2.数据存到request域中
        request.setAttribute("product",productByPid);
        request.getRequestDispatcher("/admin/product/edit.jsp").forward(request,response);

    }
}
