<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/14
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    pageContext.setAttribute("user",request.getAttribute("user"));
%>
<html>
<head>
    <title>查看用户</title>
</head>
<body>
    用户名称：${user.username}<br>
    用户账号：${user.useraccount}<br>
    用户密码：${user.userpassword}<br>
    用户性别：${user.usergender}<br>
    用户年龄：${user.userage}<br>
    用户地址：${user.useraddress}<br>
    用户邮箱：${user.useremail}<br>
</body>
</html>