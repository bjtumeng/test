package com.itheima.web;

import com.itheima.VO.PageBean;
import com.itheima.domain.Product;
import com.itheima.service.ProductService;

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
 * @Date: Created in 9:22 2018/6/16
 * @Modified By:
 */
@WebServlet(name = "ProductServlet",value="/productList")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductService productService=new ProductService();
        PageBean<Product> PageBean=null;
        String currentPageStr = request.getParameter("currentPage");
        if(currentPageStr==null){
            currentPageStr="1";
        }
        int currentPage=Integer.parseInt(currentPageStr);
        int currentCount=12;
        try {
            PageBean=  productService.findAllPageBean(currentCount,currentPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("PageBean",PageBean);
        request.getRequestDispatcher("/product_list.jsp").forward(request,response);

    }
}
