package com.itheima.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:41 2018/5/27
 * @Modified By:
 */
public class MyDataSourceUtils {
    //1.获得连接池
    private static ComboPooledDataSource dataSource= new ComboPooledDataSource();
    private static ThreadLocal<Connection> tl=new ThreadLocal<>();
    //不要忘记增加返回值
    public static Connection getConnection() throws SQLException {
        return  dataSource.getConnection();
    }
    public static Connection getCurrentConnection() throws SQLException {
        Connection conn = tl.get();
        if (tl==null){
            conn=getConnection();
            //将conn绑定到ThreadLocal中
            tl.set(conn);
        }
        return conn;
    }
    //为了避免代码中出现Connection，开启事务放在MyDataSourceUtils类中
    public static void startTransaction() throws SQLException {
        Connection conn = getCurrentConnection();
        conn.setAutoCommit(false);
    }
    public static void commit() throws SQLException {
        Connection conn = getCurrentConnection();
        conn.commit();
    }
    public static void rollback() throws SQLException {
        Connection conn = getCurrentConnection();
        conn.rollback();
        tl.remove();
        conn.close();
    }
}
