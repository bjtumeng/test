package com.itheima.JDBC;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 22:27 2018/5/25
 * @Modified By:
 */
public class JDBCDemo {
    public static void main(String [] args)  {
        Connection conn=null;
        //1.创建数据库驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得Connection
             conn = DriverManager.getConnection("jdbc:mysql:///web13", "root", "root");
            //3.获得statement
            Statement statement = conn.createStatement();
            //手动开启事务
            conn.setAutoCommit(false);
            //4.操作sql
            statement.executeUpdate("insert into account values(null,'tom',4000)");
            conn.commit();
            //5.关闭资源
            statement.close();
            conn.close();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }
}
