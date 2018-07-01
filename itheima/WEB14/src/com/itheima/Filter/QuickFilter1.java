package com.itheima.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

import static javax.servlet.DispatcherType.FORWARD;
import static javax.servlet.DispatcherType.REQUEST;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:43 2018/6/25
 * @Modified By:
 */
@WebFilter(filterName = "QuickFilter1",
           urlPatterns = {"/*"},
           dispatcherTypes = {FORWARD})
public class QuickFilter1 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("quick1 running.......");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
