package com.itheima.web;

import com.itheima.domain.Product;
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
 * @Date: Created in 22:07 2018/5/24
 * @Modified By:
 */
@WebServlet(name = "AdminProductServlet",value="/product")
public class AdminProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdminProductService adminProductService =new AdminProductService();
        List<Product> productList=null;
        try {
            productList = adminProductService.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //数据准备好了，转发给jsp
        request.setAttribute("productList",productList);
        request.getRequestDispatcher("/product_list.jsp").forward(request,response);
    }
}
