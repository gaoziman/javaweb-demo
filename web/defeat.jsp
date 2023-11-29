<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/11/28
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录失败</title>
</head>
<body>
<h1>登录失败！</h1>
<font color="red">
    <%
        if(request.getAttribute("message")!= null){
            out.print(request.getAttribute("message"));
        }
    %>
</font>
<br>
<a href="login.jsp">重新登录</a>
</body>
</html>