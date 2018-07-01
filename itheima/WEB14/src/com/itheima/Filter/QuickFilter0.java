//package com.itheima.Filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.annotation.WebInitParam;
//import java.io.IOException;
//
///**
// * @Author:zhaomeng
// * @Description:
// * @Date: Created in 21:03 2018/6/25
// * @Modified By:
// */
//@WebFilter(filterName = "QuickFilter0",urlPatterns = {"/*"},initParams = {
//        @WebInitParam(name = "username", value = "zhangsan"),
//                @WebInitParam(name = "password", value = "123")
//})
//public class QuickFilter0 implements Filter {
//    public void destroy() {
//        System.out.println("destroy.....");
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        System.out.println("quick2 running .......");
//          chain.doFilter(req, resp);
//
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//        System.out.println( config.getFilterName());
//        System.out.println(config.getInitParameter("username"));
//        System.out.println(config.getServletContext());
//        System.out.println(config.getInitParameterNames());
//        System.out.println("init.....");
//    }
//
//}
