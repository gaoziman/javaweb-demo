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
    <title>注册界面</title>
    <style type="text/css">
        body{
            background-repeat: no-repeat;
            background-position: center;
        }

    </style>
</head>
<body>
<div style="text-align:center;margin-top: 120px">
    <form action="/register" method="post">
        <table style="margin-left:40%">
            <h2>用户注册</h2>
            <tr>
                <td>用户名：</td>
                <td><input name="username" type="text" size="21"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input name="password" type="password" size="21"></td>
            </tr>
        </table>
        <input type="submit" value="注册">
        <input type="reset" value="重置">
    </form>
    <a href="login.jsp">跳转登录</a>
    </form>
</div>

</body>
</html>