<%@ page import="com.itheima.domain.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/5/23
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%--往四大域中放数据--%>
      <%
          //存储字符串
        request.setAttribute("company","dorequest");
        //存储字符串
        User user=new User();
        user.setId(1);
        user.setEmail("dodo");
        user.setUsername("dosession");
        user.setPassword("ssssss");
        session.setAttribute("user",user);
       //存储集合
          List<User> list=new ArrayList<>();
          User user1=new User();
          user1.setId(2);
          user1.setEmail("dodo");
          user1.setUsername("ssss");
          user1.setPassword("ssssss");
          list.add(user1);
          User user2=new User();
          user2.setId(3);
          user2.setEmail("dodo");
          user2.setUsername("doapplication");
          user2.setPassword("ssssss");
          list.add(user2);
        application.setAttribute("list",list);
      %>
     </hr>
      <%--//使用脚本方式取数据--%>
      <%=request.getAttribute("company")%>
      <%
          User userSession = (User)session.getAttribute("user");
          out.write(userSession.getUsername());
      %>
     <%--  使用EL表达式取域中的数据--%>
    ${requestScope.company}
    ${sessionScope.user.username}
    ${applicationScope.list[1].username}
</body>
</html>
