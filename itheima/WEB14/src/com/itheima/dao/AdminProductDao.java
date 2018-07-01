package com.itheima.dao;

import com.itheima.domain.Product;
import com.itheima.VO.Condition;
import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 22:06 2018/5/24
 * @Modified By:
 */
public class AdminProductDao {
    public List<Product> findAll() throws SQLException {
     //操作数据库
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from product";
        List<Product> productList = runner.query(sql, new BeanListHandler<Product>(Product.class));
        return productList;
    }

    public void addProduct(Product product) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="insert into product values(?,?,?,?,?,?,?,?,?,?) ";
        runner.update(sql,product.getPid(),product.getPname(),product.getMarket_price(),
                   product.getShop_price(),product.getPimage(),product.getPdate(),product.getIs_hot(),
                   product.getPdesc(),product.getPflag(),product.getCid());
    }

    public void delProductByPid(String pid) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="delete from product where pid=?";
        runner.update(sql,pid);
    }

    public Product findProductByPid(String pid) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from product where pid=? ";
        Product product = runner.query(sql, new BeanHandler<Product>(Product.class),pid);
        return product;
    }

    public void updateProduct(Product product) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="update product set pname=?,market_price=?,shop_price=?,pimage=?,pdate=?,is_hot=?,pdesc=?,pflag=?,cid=? where pid=? ";
        runner.update(sql,product.getPname(),product.getMarket_price(),
                product.getShop_price(),product.getPimage(),product.getPdate(),product.getIs_hot(),
                product.getPdesc(),product.getPflag(),product.getCid(),product.getPid());
    }

    public List<Product> findProductListByCondition(Condition condition) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        List<String> productList=new ArrayList<>();
        StringBuffer sql=new StringBuffer("select * from product where 1=1");
        if(condition.getPname()!=null&&!condition.getPname().trim().equals("")){
               sql.append(" and pname like ? ");
               productList.add("%"+condition.getPname().trim()+"%");
        }
        if(condition.getCid()!=null&&!condition.getCid().trim().equals("")){
            sql.append(" and cid=? ");
            productList.add(condition.getCid().trim());
        }
        if(condition.getIs_hot()!=null&&!condition.getIs_hot().trim().equals("")){
            sql.append(" and is_hot=? ");
            productList.add(condition.getPname().trim());
        }
        Object[] objects = productList.toArray();
        List<Product> product = runner.query(sql.toString(), new BeanListHandler<Product>(Product.class), objects);
        return product;
    }
}
