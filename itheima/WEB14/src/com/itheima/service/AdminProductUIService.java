package com.itheima.service;

import com.itheima.dao.AdminProductListDao;
import com.itheima.dao.AdminProductUIDao;
import com.itheima.domain.Category;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:17 2018/6/5
 * @Modified By:
 */
public class AdminProductUIService {
    public List<Category> findAllCategory() throws SQLException {
      AdminProductUIDao adminProductUIDao=new AdminProductUIDao();
        List<Category> categoryList = adminProductUIDao.findAllCategory();
        return categoryList;
    }
}
