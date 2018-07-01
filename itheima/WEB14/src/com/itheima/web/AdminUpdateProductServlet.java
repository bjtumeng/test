package com.itheima.web;

import com.itheima.domain.Product;
import com.itheima.service.AdminProductService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 22:04 2018/6/8
 * @Modified By:
 */
@WebServlet(name = "AdminUpdateProductServlet",value="/adminUpdateProduct")
public class AdminUpdateProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //1.收集网页的数据
        Map<String, String[]> parameterMap = request.getParameterMap();
        //2.封装数据
        Product product=new Product();
        try {
            BeanUtils.populate(product,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //3.手动添加数据
        product.setPimage("products/1/c_0001.jpg");
        product.setPflag(0);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String format = simpleDateFormat.format(new Date());
        product.setPdate(format);
        //4.传递数据
        AdminProductService adminProductService =new AdminProductService();
        try {
            adminProductService.updateProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect(request.getContextPath()+"/adminProductList");
    }
}
