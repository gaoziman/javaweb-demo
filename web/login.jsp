<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/11/28
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <style type="text/css">
        body{
            background-position: center;
            background-repeat: no-repeat;
        }
    </style>
</head>
<body>
<div style="text-align:center;margin-top:100px">
    <h2>登录页面</h2>
    <form action="/login" method="post">
        <table style="margin-left:40%">
            <tr>
                <td>用户名：</td>
                <td><input type="text" size="21" name="username"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="text" size="21" name="password"/></td>
            </tr>
        </table>
        <input type="submit" value="登录"/>
        <input type="reset" value="重置"/>
    </form>
    <a href="register.jsp">跳转注册</a>
</div>
</body>
</html>
