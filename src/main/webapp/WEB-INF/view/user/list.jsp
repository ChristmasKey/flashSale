<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/14
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    pageContext.setAttribute("basePath",basePath);
    pageContext.setAttribute("userList",request.getAttribute("userList"));
%>
<html>
<head>
    <title>查看多个用户</title>
</head>
<body>
<div style="text-align: center;">
    <a href="${basePath}/user/toAdd">添加</a>
</div>
<table border="2">
    <tr>
        <td>用户名称</td>
        <td>用户账号</td>
        <td>用户密码</td>
        <td>用户性别</td>
        <td>用户年龄</td>
        <td>用户地址</td>
        <td>用户邮箱</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.useraccount}</td>
            <td>${user.userpassword}</td>
            <td>${user.usergender}</td>
            <td>${user.userage}</td>
            <td>${user.useraddress}</td>
            <td>${user.useremail}</td>
            <td>
                <a href="${basePath}/user/toUpdate?id=${user.id}">修改</a>
                <a href="${basePath}/user/deleteUser?id=${user.id}">删除</a>
                <a href="${basePath}/user/queryUserById?id=${user.id}">查看</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>