package com.itheima.dao;

import com.itheima.utils.DataSourceUtils;
import com.itheima.utils.MyDataSourceUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 11:01 2018/5/27
 * @Modified By:
 */
public class TransferDao {
    //1.账户中转入钱
    public Boolean in( String in, double money) throws SQLException {
        QueryRunner runner=new QueryRunner();
        Connection conn= MyDataSourceUtils.getCurrentConnection();
        String sql="update account set money=money-? where name=?";
        runner.update(conn,sql,money,in);
        return true;
    }
   //2.账户中转出钱
    public Boolean out(String out, double money) throws SQLException {
        QueryRunner runner=new QueryRunner();
        Connection conn= MyDataSourceUtils.getCurrentConnection();
        String sql="update account set money=money+? where name=?";
        runner.update(conn,sql,money,out);
        return true;
    }
}
