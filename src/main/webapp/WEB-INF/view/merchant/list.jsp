<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/14
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    pageContext.setAttribute("basePath",basePath);
    pageContext.setAttribute("merchantList",request.getAttribute("merchantList"));
%>
<html>
<head>
    <title>查看多个商家</title>
</head>
<body>
<div style="text-align: center;"><a href="${basePath}/merchant/toAdd">添加</a></div>
<table border="2">
    <tr>
        <td>商家姓名</td>
        <td>店铺名称</td>
        <td>商家账号</td>
        <td>商家密码</td>
        <td>经营范围</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${merchantList}" var="merchant">
        <tr>
            <td>${merchant.merchantname}</td>
            <td>${merchant.merchantshopname}</td>
            <td>${merchant.merchantaccount}</td>
            <td>${merchant.merchantpassword}</td>
            <td>${merchant.merchantscope}</td>
            <td>
                <a href="${basePath}/merchant/toUpdate?id=${merchant.id}">修改</a>
                <a href="${basePath}/merchant/deleteMerchant?id=${merchant.id}">删除</a>
                <a href="${basePath}/merchant/queryMerchantById?id=${merchant.id}">查看</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
