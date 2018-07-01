package com.itheima.Filter;

import com.itheima.domain.User;
import com.itheima.service.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:23 2018/6/26
 * @Modified By:
 */
@WebFilter(filterName = "AutoLoginFilter",urlPatterns = {"/*"})
public class AutoLoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.获得cookie中的username和password
        HttpServletRequest request=(HttpServletRequest)req;
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        String cookie_username=null;
        String cookie_password=null;
        if(cookies!=null) {
            for (Cookie cookie : cookies) {
                if ("cookie_username".equals(cookie.getName()) ) {
                    cookie_username=cookie.getValue();
                }
                if ("cookie_password".equals(cookie.getName())){
                    cookie_password=cookie.getValue();
                }
            }
        }
        //2.根据username和password获得user对象,并存到session中
         if(cookie_username!=null&&cookie_password!=null){
             UserService userService=new UserService();
             User user=null;
             try {
                 user=userService.login(cookie_username,cookie_password);
             } catch (SQLException e) {
                 e.printStackTrace();
             }
             session.setAttribute("userInfo",user);
         }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
