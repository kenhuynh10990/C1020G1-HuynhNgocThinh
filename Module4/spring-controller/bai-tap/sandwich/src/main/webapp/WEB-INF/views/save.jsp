<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/2/2021
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save">
    <h2>Sandwich Condiments</h2>
    <input type="checkbox" value="Lettuce" name="condiment"> <label>Lettuce</label>
    <input type="checkbox" value="Tomato" name="condiment"><label>Tomato</label>
    <input type="checkbox" value="Mustard" name="condiment"><label>Mustard</label>
    <input type="checkbox" value="Sprouts" name="condiment"><label>Sprouts</label>
    <br>
    <input type="submit" value="Save">

    <h2>Condiments</h2>
<c:forEach items="${condiment}" var="condiment">
    ${condiment}
</c:forEach>

</form>
</body>
</html>
