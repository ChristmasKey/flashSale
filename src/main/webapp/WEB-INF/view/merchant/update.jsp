<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/13
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    pageContext.setAttribute("basePath",basePath);
    pageContext.setAttribute("merchant",request.getAttribute("merchant"));
%>
<html>
<head>
    <title>更新商家</title>
</head>
<body>
<form action="${basePath}/merchant/updateMerchant">
    <input name="id" type="hidden" value="${merchant.id}">
    商家姓名：<input name="merchantname" value="${merchant.merchantname}"><br>
    店铺名称：<input name="merchantshopname" value="${merchant.merchantshopname}"><br>
    商家账号：<input name="merchantaccount" value="${merchant.merchantaccount}"><br>
    商家密码：<input name="merchantpassword" value="${merchant.merchantpassword}"><br>
    经营范围：<input name="merchantscope"  value="${merchant.merchantscope}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
