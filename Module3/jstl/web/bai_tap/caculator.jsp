<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/1/2021
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h2>Simple caculator</h2>
<form action="/caculate" method="get">
    <label>First operand</label>
    <input type="text" name="number1"> <br>
    <label>Operator</label>
    <select name="operator">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
    </select>
    <br>
    <label>Second operand</label>
    <input type="text" name="number2"/>
    <br>
    <input type="submit" value="Caculate">
</form>
</body>
</html>
