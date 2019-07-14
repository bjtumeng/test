package com.channelsoft.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaomeng
 * @Description:
 * @date 2019/7/14 10:38
 */
@Controller
public class ShiroController {
   @RequestMapping("/shiro/login")
    public String login(String username,String password){
       Subject currentUser = SecurityUtils.getSubject();
       if (!currentUser.isAuthenticated()) {
           //把用户名和密码封装
           UsernamePasswordToken token = new UsernamePasswordToken(username, password);
           token.setRememberMe(true);
           try {
               //执行登录
               currentUser.login(token);
           } catch (AuthenticationException ae) {
              ae.printStackTrace();
           }
       }
       return "redirect:/list.jsp";
   }
}
