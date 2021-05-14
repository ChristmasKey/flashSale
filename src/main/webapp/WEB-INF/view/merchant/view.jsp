<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/13
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    pageContext.setAttribute("merchant",request.getAttribute("merchant"));
%>
<html>
<head>
    <title>查看商家</title>
</head>
<body>
<div>
    商家姓名：${merchant.merchantname}<br>
    店铺名称：${merchant.merchantshopname}<br>
    商家账号：${merchant.merchantaccount}<br>
    商家密码：${merchant.merchantpassword}<br>
    经营范围：${merchant.merchantscope}
</div>
</body>
</html>
