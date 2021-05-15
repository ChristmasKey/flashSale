<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/12
  Time: 23:30
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
    <title>新增商家</title>
</head>
<body>
<h1>商家界面</h1>
<form action= "${basePath}/merchant/insertMerchant" method="post">
    商家姓名：<input name="merchantname"><br>
    店铺名称：<input name="merchantshopname"><br>
    商家账号：<input name="merchantaccount"><br>
    商家密码：<input name="merchantpassword" type="password"><br>
    经营范围：<input name="merchantscope"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
