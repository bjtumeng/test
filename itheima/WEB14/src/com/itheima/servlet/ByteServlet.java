package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:06 2018/4/24
 * @Modified By:
 */
@WebServlet(name = "ByteServlet",value = "/byte")
public class ByteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //输出流out
        ServletOutputStream out = response.getOutputStream();
        //输入流
        String realPath = this.getServletContext().getRealPath("a.jpg");
        InputStream in= new FileInputStream(realPath);

        int len=0;
        byte[] buffer=new byte[1024];
        while((len= in.read(buffer))>0){
            out.write(buffer,0,len);
        }
         in.close();
        out.close();

    }
}
