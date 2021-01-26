<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/1/2021
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Customer</title>
</head>
<body>
<form action="#" method="post">

    <input type="hidden" name="id" value="${customerInfo.id}">
    <input type="hidden" name="actionUser" value="update">
    <p>
        Name:
        <input type="text" value="${customerInfo.name}" name="name">
    </p>
    <p>
        Email:
        <input type="text" value="${customerInfo.email}" name="email">
    </p>
    <p>
        Address:
        <input type="text" value="${customerInfo.address}" name="address">
    </p>
    <p>
        <input type="submit" value="Save">
    </p>
</form>
</body>
</html>
