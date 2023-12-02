<%@ page import="org.javatop.case01.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/11/28
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html lang="en">
<head>
    <title>登录成功</title>
</head>
<body>
<h1>登录成功！</h1>
<br>
<font color="red">
    <%
        User user = (User)request.getAttribute("user");
        String username = user.getUsername();
    %>
    欢迎您：
    <%
        out.print(username);
    %>
</font>

</body>
</html>
