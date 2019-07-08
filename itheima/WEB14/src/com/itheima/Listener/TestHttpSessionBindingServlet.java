package com.itheima.Listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 11:12 2018/6/23
 * @Modified By:
 */
@WebServlet(name = "TestHttpSessionBindingServlet",value="/testBinding")
public class TestHttpSessionBindingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request,response);
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
     Person person=new Person();
     person.setId(1);
     person.setName("zhangsan");
     person.setEmail("zhangsan@zhangsan.com");
     HttpSession session = request.getSession();
     //person被绑定到session域中
     session.setAttribute("person",person);
     //person从session域中解绑
     session.removeAttribute("person");
    }
}
