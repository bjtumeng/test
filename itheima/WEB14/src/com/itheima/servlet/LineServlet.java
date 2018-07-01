package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 23:05 2018/4/27
 * @Modified By:
 */
@WebServlet(name = "LineServlet",value="/line")
public class LineServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            1.获得请求方式
        String method = request.getMethod();
//        System.out.println(method);
//        2.获得请求资源的相关内容
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
//        System.out.println("URI:"+requestURI);
//        System.out.println("URL:"+requestURL);
//        3.获得Web应用的名称
        String contextPath = request.getContextPath();
//        System.out.println("contextPath:"+contextPath);
//        4.地址后的参数的字符串
        String queryString = request.getQueryString();
//        System.out.println(queryString);
//        5.获得浏览器的信息   访问者的IP
        String remoteAddr = request.getRemoteAddr();
//        System.out.println(remoteAddr);
//       6.获得指定头信息
        String header = request.getHeader("User-Agent");
//        System.out.println(header);
//       7.获得所有头名称
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
//            System.out.println(headerName+":"+headerValue);
        }
    }
}
