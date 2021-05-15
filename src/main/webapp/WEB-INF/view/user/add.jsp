<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/14
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    pageContext.setAttribute("basePath",basePath);
%>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
<form action="${basePath}/user/insertUser" method="post">
    用户名称：<input name="username"><br>
    用户账号：<input name="useraccount"><br>
    用户密码：<input name="userpassword"><br>
    用户性别：<input name="usergender"><br>
    用户年龄：<input name="userage"><br>
    用户地址：<input name="useraddress"><br>
    用户邮箱：<input name="useremail"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>