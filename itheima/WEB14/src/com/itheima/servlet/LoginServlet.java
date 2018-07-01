package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:46 2018/4/19
 * @Modified By:zhaomeng
 */
@WebServlet(name = "LoginServlet",value="/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType ("text/html;charset=UTF-8");
        //1.1获取表单提交的数据
        String checkCode = request.getParameter("checkCode");
        //1.2 获取验证码的信息
        HttpSession session = request.getSession();
        String checkcode_session = (String)session.getAttribute("checkcode_session");
        if(!checkcode_session.equals(checkCode)){
            request.setAttribute("loginInfo","验证码不正确");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }

        //1.获得用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        //2.从数据库验证用户名与密码是否正确
        Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/web13";
        //MySQL配置时的用户名
        String user1 = "root";
        //MySQL配置时的密码
        String password1 = "root";

          try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url, user1, password1);
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //3.要执行的SQL语句
            String sql = "select * from USER ";
            //4.ResultSet类，用来存放获取的结果集
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                //循环验证
                String nameTest=rs.getString("username");
                String passwordTest=rs.getString("password");
                if(username.equals(nameTest)&&password.equals(passwordTest)){

                    response.getWriter().write("登录成功");
                    System.out.println("登录成功");
                    return;
                }
            }
            response.getWriter().write("登录失败");
            rs.close();
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            System.out.println("数据库数据成功获取！！");
        }
        //3.根据不同结果返回用户不同信息
    }
}



