package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:25 2018/6/17
 * @Modified By:
 */
public class UserDao {
    public Long CheckUsername(String username) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select count(*) from user where username=?";
        Long query = (Long)runner.query(sql, new ScalarHandler(), username);
        return query;
    }

    public User login(String username, String password) throws SQLException {
        QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from user where username=? and password=?";
        User user = runner.query(sql, new BeanHandler<User>(User.class), username, password);
        return user;

    }
}
