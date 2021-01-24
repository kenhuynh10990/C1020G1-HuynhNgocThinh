<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/1/2021
  Time: 11:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/calculator">
    <h3>Product description</h3>
    <input type="text" name="productDescription">
    <h3>List price</h3>
    <input type="text" name="listPrice">
    <h3>Discount percent</h3>
    <input type="text" name="discountPercent">
    <br>
    <input type="submit" value="Calculator">
</form>

</body>
</html>
