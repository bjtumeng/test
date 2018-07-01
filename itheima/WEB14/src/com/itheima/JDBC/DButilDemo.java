package com.itheima.JDBC;

import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import javax.management.Query;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 10:15 2018/5/27
 * @Modified By:
 */
public class DButilDemo {
    public static void main(String[] args) {
        Connection conn=null;
        try {
            QueryRunner runner=new QueryRunner();
             conn = DataSourceUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            runner.update(conn,"update account set money=5000 where name='tom'");
            //runner.update("update account set money=5000 where name='tom'");
            conn.commit();
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }
}
