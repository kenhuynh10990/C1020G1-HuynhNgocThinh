<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/1/2021
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?actionUser=create">Add New User</a>

    </h2>
    <h2>
        <a href="users?actionUser=users">List All Users</a>
    </h2>
    <h2>
        <form action="/users">
            <input type="hidden" name="actionUser" value="search">
            <input type="text" name="country" value="${country}">
            <button type="submit">Search</button>
        </form>

    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/users?actionUser=update&id=${user.id}">Edit</a>
                    <a href="/users?actionUser=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
