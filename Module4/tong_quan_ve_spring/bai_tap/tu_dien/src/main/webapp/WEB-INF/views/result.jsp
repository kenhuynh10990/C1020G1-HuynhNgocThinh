<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/2/2021
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dictionary">
    <input type="text" name="text" value="${text}">
    <input type="submit" value="Search">
</form>
<h2>Result: ${result}</h2>
</body>
</html>
