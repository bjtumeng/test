//package com.itheima.Filter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequestWrapper;
//import java.io.UnsupportedEncodingException;
//
///**
// * @Author:zhaomeng
// * @Description:
// * @Date: Created in 21:15 2018/6/27
// * @Modified By:
// */
//public class EnhanceRequest extends HttpServletRequestWrapper {
//    private HttpServletRequest request;
//
//    public EnhanceRequest(HttpServletRequest request) {
//        super(request);
//        this.request = request;
//    }
//
//    @Override
//    public String getParameter(String name) {
//        String parameter = request.getParameter(name);
//        try {
//            parameter = new String(parameter.getBytes("iso8859-1"), "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        return parameter;
//    }
//}
