package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:23 2018/6/17
 * @Modified By:
 */
public class UserService {
    public Boolean CheckUsername(String username) throws SQLException {
    UserDao dao=new UserDao();
    Long isExit=dao.CheckUsername(username);
    return isExit>0?true:false;
    }

    public User login(String username, String password) throws SQLException {
    UserDao dao=new UserDao();
    User user=dao.login(username,password);
    return user;
    }
}
