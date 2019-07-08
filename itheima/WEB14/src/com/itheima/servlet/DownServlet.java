package com.itheima.servlet;

import sun.misc.BASE64Encoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 22:13 2018/4/24
 * @Modified By:
 */
@WebServlet(name = "DownServlet",value="/down")
public class DownServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得文件的名称
       //本来是美女.jpg，因为解码问题变成乱码
        String filename = request.getParameter("filename");
//       filename = new String(filename.getBytes("iso8859-1"),"utf-8");
       byte[] bytes = filename.getBytes("iso-8859-1");
       String file = new String(bytes,"UTF-8");
       System.out.println(file);
       //获得请求头中的User-Agent
        String agent = request.getHeader("User-Agent");
        //根据不同浏览器进行不同的编码
        String filenameEncoder = "";
        if (agent.contains("MSIE")) {
            // IE浏览器
            filenameEncoder = URLEncoder.encode(filename, "utf-8");
            filenameEncoder = filenameEncoder.replace("+", " ");
        } else if (agent.contains("Firefox")) {
            // 火狐浏览器
            BASE64Encoder base64Encoder = new BASE64Encoder();
            filenameEncoder = "=?utf-8?B?"
                    + base64Encoder.encode(filename.getBytes("UTF-8")) + "?=";
        } else {
            // 其它浏览器
            filenameEncoder = URLEncoder.encode(filename, "UTF-8");
        }
        //要下载文件的类型
        response.setContentType(this.getServletContext().getMimeType(filename));
        //告诉浏览器不要解析，以附件形式下载
        response.setHeader("Content-Disposition","attachment;filename="+filenameEncoder);
        //filename需要是未编码过的美女.jpg
        String realPath = this.getServletContext().getRealPath("download/"+filename);
        System.out.println(realPath);
        ServletOutputStream out = response.getOutputStream();
        InputStream in=new FileInputStream(realPath);
        int len=0;
        byte[] buffer=new byte[1024];
        while((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
        in.close();
        out.close();
    }
}
