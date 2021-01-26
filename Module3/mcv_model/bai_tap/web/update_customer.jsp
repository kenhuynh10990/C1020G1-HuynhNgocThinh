<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/1/2021
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update_customer</title>
</head>
<body>
<form action="#" method="post">

    <input type="hidden" name="id" value="${productInfo.id}">
    <input type="hidden" name="actionUser" value="update">
    <p>
        Name:
        <input type="text" value="${productInfo.name_product}" name="name_product">
    </p>
    <p>
        Cost:
        <input type="text" value="${productInfo.cost}" name="cost">
    </p>
    <p>
        <input type="submit" value="Save">
    </p>
</form>

</body>
</html>
