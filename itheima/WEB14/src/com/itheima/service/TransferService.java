package com.itheima.service;

import com.itheima.dao.TransferDao;
import com.itheima.utils.DataSourceUtils;
import com.itheima.utils.MyDataSourceUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 10:58 2018/5/27
 * @Modified By:
 */
public class TransferService {

    public Boolean transfor(String in, String out, double money) {
        TransferDao transferDao =new TransferDao();
       Boolean isTransferSucces=true;
//        Connection conn=null;
        try {
            //为了获得相同的Connection
//            conn= DataSourceUtils.getConnection();
//            conn.setAutoCommit(false);
            //开启事务
            MyDataSourceUtils.startTransaction();
            //1.转出方法
            transferDao.out(out,money);
            //2.转入方法
            transferDao.in(in,money);
        } catch (Exception e) {
            isTransferSucces=false;
            try {
                MyDataSourceUtils.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                MyDataSourceUtils.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

       return isTransferSucces;
    }

}
