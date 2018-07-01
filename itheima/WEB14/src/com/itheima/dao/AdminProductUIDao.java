package com.itheima.dao;

import com.itheima.domain.Category;
import com.itheima.domain.Product;
import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:33 2018/6/5
 * @Modified By:
 */
public class AdminProductUIDao {
    public List<Category> findAllCategory() throws SQLException {
            QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
            String sql="select * from category";
            List<Category> categoryList = runner.query(sql, new BeanListHandler<Category>(Category.class));
            return categoryList;
    }
}
