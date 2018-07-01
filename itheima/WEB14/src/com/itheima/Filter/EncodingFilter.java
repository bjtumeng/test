package com.itheima.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.reflect.Proxy.newProxyInstance;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:07 2018/6/27
 * @Modified By:
 */
@WebFilter(filterName = "EncodingFilter",urlPatterns = {"/*"})
public class EncodingFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       //1.将ServletRequst强制转成HttpServletRequest
       final  HttpServletRequest request=(HttpServletRequest)req;
        HttpServletRequest proxy=(HttpServletRequest)Proxy.newProxyInstance(request.getClass().getClassLoader(),
                request.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        String str =null;
                        if("getParameter".equals(name)){
                            str=(String)method.invoke(request, args);
                            str=new String(str.getBytes("iso8859-1"),"UTF-8");
                            return str;
                        }
                        return method.invoke(request,args);
                    }
                }
                );
              chain.doFilter(proxy, resp);
//        //2.创建加强类,并且传递参数
//        EnhanceRequest  enhanceRequest=new EnhanceRequest(request);

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
class EnhanceRequest extends HttpServletRequestWrapper{
     private HttpServletRequest request;

    public EnhanceRequest(HttpServletRequest request) {
        super(request);
        this.request=request;
    }

    @Override
    public String getParameter(String name) {
        String parameter = request.getParameter(name);
//        try {
////            parameter=new String(parameter.getBytes("iso8859-1"),"UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        return parameter;
    }
}
