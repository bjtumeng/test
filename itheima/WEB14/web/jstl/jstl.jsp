<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.itheima.domain.User" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/5/24
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
                 <%
                 request.setAttribute("count",9);
                 %>
           <c:if test="${count==9}">
             xxxxxxxxx
           </c:if>
           <c:if test="${1!=1}">
               xxxxxxxxx
           </c:if>
           <c:forEach begin="0" end="5" var="i">
               ${i+1}<br/>
           </c:forEach>

<%
    List<String> list =new ArrayList<>();
    list.add("zhangsan");
    list.add("lisi");
    list.add("wangwu");
    session.setAttribute("list",list);
%>
                 <%
                     List<User> userList=new ArrayList<>();
                    User user =new User();
                    user.setId(1);
                    user.setEmail("1111");
                    user.setPassword("123");
                    user.setUsername("zhaomeng");
                     User user2 =new User();
                     user2.setId(2);
                     user2.setEmail("2222");
                     user2.setPassword("2222");
                     user2.setUsername("limeng");
                     userList.add(user);
                     userList.add(user2);
                     session.setAttribute("user",userList);
                 %>
                 <%
                     Map<String,String> userMap=new HashMap<>();
                     userMap.put("username","zhaomeng");
                     userMap.put("add","xisanqi");
                     userMap.put("phone","12313");
                     session.setAttribute("userMap",userMap);
                 %>
                 <%
                     Map<String,User> strMap=new HashMap<>();
                     strMap.put("username",user2);
                     strMap.put("add",user);
                     session.setAttribute("strMap",strMap);
                 %>
                 <c:forEach items="${list}" var="i">
                     ${i}<br/>
                 </c:forEach>
                 <c:forEach items="${user}" var="i">
                     ${i.username}<br/>
                 </c:forEach>
                 <c:forEach items="${userMap}" var="entry">
                     ${entry.key}:${entry.value}<br/>
                 </c:forEach>
                 <hr/>
                 <c:forEach items="${strMap}" var="entry">
                     ${entry.key}:${entry.value.username}<br/>
                 </c:forEach>
</body>
</html>