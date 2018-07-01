package com.itheima.service;

import com.itheima.dao.AdminProductListDao;
import com.itheima.domain.Product;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:37 2018/5/28
 * @Modified By:
 */
public class AdminProductListService {
    public List<Product> findAll() throws SQLException {
        AdminProductListDao productDao=new AdminProductListDao();
        List<Product> productList = productDao.findAll();
        return productList;

    }
}
