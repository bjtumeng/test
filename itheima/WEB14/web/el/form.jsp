<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/5/23
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 ${param.username}
 ${cookie.name.value}
 <form action="${pageContext.request.contextPath}/el/form.jsp" method="post">
     <input type="text" name="username"><br>
     <input type="password" name="password"><br>
     <input type="checkbox" name="hobby" value="zq">足球
     <input type="checkbox" name="hobby" value="lq">篮球
     <input type="checkbox" name="hobby" value="ppq">乒乓球
     <input type="submit" value="提交"><br>
     <%=pageContext.getRequest().getServletContext().getContextPath()%>
</body>
</html>
