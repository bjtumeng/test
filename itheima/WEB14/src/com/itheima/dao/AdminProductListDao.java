package com.itheima.dao;

import com.itheima.domain.Product;
import com.itheima.utils.DataSourceUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:42 2018/5/28
 * @Modified By:
 */
public class AdminProductListDao {
    public List<Product> findAll() throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from product";
        List<Product> productList = runner.query(sql, new BeanListHandler<Product>(Product.class));
        return productList;
    }
}
