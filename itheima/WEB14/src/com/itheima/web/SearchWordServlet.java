package com.itheima.web;

import com.google.gson.Gson;
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
 * @Date: Created in 10:00 2018/6/18
 * @Modified By:
 */
@WebServlet(name = "SearchWordServlet",value="/searchword")
public class SearchWordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word = request.getParameter("word");
        ProductService productService=new ProductService();
        List<Object> productList=null;
        try {
            productList=productService.findProductByWord(word);
        } catch (SQLException e) {
            e.printStackTrace();
        }
         Gson gson=new Gson();
        String json = gson.toJson(productList);
        response.setContentType("text/html;charset=UTF-8");
        System.out.println(json);
        response.getWriter().write(json);
    }
}
