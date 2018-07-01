package com.itheima.web;

import com.itheima.domain.Category;
import com.itheima.domain.Product;
import com.itheima.service.AdminProductListService;
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
 * @Date: Created in 21:34 2018/5/28
 * @Modified By:
 */
@WebServlet(name = "AdminProductListServlet",value= "/adminProductList")
public class AdminProductListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         AdminProductListService adminProductService =new AdminProductListService();
        List<Product> productList = null;
        try {
            productList = adminProductService.findAll();
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
        //请求内部转发
        request.setAttribute("productList",productList);
        request.getRequestDispatcher("/admin/product/list.jsp").forward(request,response);

    }
}
