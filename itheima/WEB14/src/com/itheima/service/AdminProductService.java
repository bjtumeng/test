package com.itheima.service;

import com.itheima.dao.AdminProductDao;
import com.itheima.domain.Product;
import com.itheima.VO.Condition;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 22:06 2018/5/24
 * @Modified By:
 */
public class AdminProductService {
    public List<Product> findAll() throws SQLException {
        //没有复杂的逻辑，所以直接传递到dao层
        AdminProductDao adminProductDao =new AdminProductDao();
        List<Product> productList= adminProductDao.findAll();
        return productList;
    }

    public void addProduct(Product product) throws SQLException {
        AdminProductDao adminProductDao =new AdminProductDao();
        adminProductDao.addProduct(product);
    }
    //根据pid删除对象
    public void delProductByPid(String pid) throws SQLException {
    AdminProductDao dao=new AdminProductDao();
    dao.delProductByPid(pid);
    }
    //根据Product对象更新数据
    public void updateProduct(Product product) throws SQLException {
        AdminProductDao dao=new AdminProductDao();
        dao.updateProduct(product);
    }

    public Product findProductByPid(String pid) throws SQLException {
        AdminProductDao dao=new AdminProductDao();
        Product productByPid = dao.findProductByPid(pid);
        return productByPid;
    }

    public List<Product> findProductListByCondition(Condition condition) throws SQLException {
          AdminProductDao dao=new AdminProductDao();
        List<Product> productListByCondition = dao.findProductListByCondition(condition);
          return productListByCondition;
    }
}
