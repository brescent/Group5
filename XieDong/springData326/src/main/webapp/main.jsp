<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/28
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>


<h2>当前登录用户:${user.userName}</h2>
<body>

<table>

    <thead>
    <tr><td>权限名</td><td>url地址</td></tr>

    </thead>
    <tbody>

   <c:forEach items="${powerList}" var="power">

       <tr><td>${powerList.powerName}</td><td><a>${power.url}</a></td></tr>

    <c:forEach>

</tbody>
</table>

</body>
</html>
