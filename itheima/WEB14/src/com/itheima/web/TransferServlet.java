package com.itheima.web;

import com.itheima.service.TransferService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 10:54 2018/5/27
 * @Modified By:
 */
@WebServlet(name = "TransferServlet",value="/transfer")
public class TransferServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接受转账参数
        String in = request.getParameter("in");
        String out = request.getParameter("out");
        String strMoney = request.getParameter("money");
        double money=Double.parseDouble(strMoney);
        //2.调用service层转账方法
        TransferService transforSservice=new TransferService();
        Boolean isTransferSuccess =transforSservice.transfor(out,in,money);
        //1.解决乱码问题，并提示转账成功或者失败
        response.setContentType("text/html;charset=UTF-8");
        if (isTransferSuccess){
            response.getWriter().write("转账成功");
        }else{
            response.getWriter().write("转账失败");
        }
    }
}
