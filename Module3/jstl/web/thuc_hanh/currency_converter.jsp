<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/1/2021
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Currency converter</h2>
<form action="converter.jsp" , method="post">
    <label > Rate</label>
    <input type="text" name="rate">
    <label >USD</label>
    <input type="text" name="usd">
    <input type="submit" value="Converter">
</form>
</body>
</html>
