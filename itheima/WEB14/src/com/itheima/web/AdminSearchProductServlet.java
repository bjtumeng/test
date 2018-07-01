package com.itheima.web;

import com.itheima.VO.Condition;
import com.itheima.domain.Category;
import com.itheima.domain.Product;
import com.itheima.service.AdminProductUIService;
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
import java.util.List;
import java.util.Map;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 11:09 2018/6/9
 * @Modified By:
 */
@WebServlet(name = "AdminSearchProductServlet",value="/adminSearchProduct")
public class AdminSearchProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
       //1.获取表单数据
        Map<String, String[]> parameterMap = request.getParameterMap();
        //创建condition实体
        Condition condition=new Condition();
        try {
            BeanUtils.populate(condition,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        AdminProductService adminProductService =new AdminProductService();
        List<Product> productList = null;
        try {
            productList = adminProductService.findProductListByCondition(condition);
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
        request.setAttribute("condition",condition);
        //把ProductListByCondition数据存到域中
        request.setAttribute("productList",productList);
        request.getRequestDispatcher("/admin/product/list.jsp").forward(request,response);
    }
}
