<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/11/28
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java"%>--%>
<%@ page contentType="text/html; charset=gb2312" language="java" %>
<html lang="en">
<head>
    <title>µÇÂ¼Ê§°Ü</title>
</head>
<body>
<h1>µÇÂ¼Ê§°Ü£¡</h1>
<font color="red">
    <%
        if(request.getAttribute("message")!= null){
            response.setContentType("text/html;charset=UTF-8");
            out.print(request.getAttribute("message"));
        }
    %>
</font>
<br>
<a href="login.jsp">ÖØÐÂµÇÂ¼</a>
</body>
</html>