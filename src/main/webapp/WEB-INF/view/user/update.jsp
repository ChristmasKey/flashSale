<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/14
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    pageContext.setAttribute("basePath",basePath);
    pageContext.setAttribute("user",request.getAttribute("user"));
%>
<html>
<head>
    <title>更新用户</title>
</head>
<body>
<form action="${basePath}/user/updateUser" method="post">
    <input type="hidden" name="id" value="${user.id}">
    用户名称：<input name="username" value="${user.username}"><br>
    用户账号：<input name="useraccount" value="${user.useraccount}"><br>
    用户密码：<input name="userpassword" value="${user.userpassword}"><br>
    用户性别：<input name="usergender" value="${user.usergender}"><br>
    用户年龄：<input name="userage" value="${user.userage}"><br>
    用户地址：<input name="useraddress" value="${user.useraddress}"><br>
    用户邮箱：<input name="useremail" value="${user.useremail}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>