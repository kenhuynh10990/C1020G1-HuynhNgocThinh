<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/2/2021
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/result">
    <h1>Caculator</h1>
    <input type="number" name="number1" required>
    <input type="number" name="number2" required><br>
    <input type="submit" value="Additions(+)" name="operator">
    <input type="submit" value="Subtraction(-)" name="operator">
    <input type="submit" value="Multiplication(*)" name="operator">
    <input type="submit" value="Division(/)" name="operator">

    <h2>Result ${operator} :${result}</h2>
</form>
</body>
</html>
