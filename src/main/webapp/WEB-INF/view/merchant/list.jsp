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
    pageContext.setAttribute("merchantList",request.getAttribute("merchantList"));
%>
<html>
<head>
    <title>查看多个商家</title>
</head>
<body>
<c:forEach items="${merchantList}" var="merchant">
    商家姓名：${merchant.merchantname}<br>
    店铺名称：${merchant.merchantshopname}<br>
    商家账号：${merchant.merchantaccount}<br>
    商家密码：${merchant.merchantpassword}<br>
    经营范围：${merchant.merchantscope}
    <hr/>
</c:forEach>
</body>
</html>
