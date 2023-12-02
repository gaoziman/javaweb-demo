<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/11/28
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="form-container">
    <h2>注册</h2>
    <form action="/register" method="post">
        <input type="text" placeholder="Username" name="username" required>
        <input type="password" placeholder="Password" name="password" required>
        <button type="submit">注册</button>
    </form>
</div>
</body>
</html>
