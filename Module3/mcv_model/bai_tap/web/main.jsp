<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/1/2021
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Main</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
</head>
<body>
<table class="table">
    
    <tr><a href="productServlet?actionUser=create">Add New Product</a></tr>
    <thead>
    <tr class="table-primary">
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Cost</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="products" items="${productList}">
        <tr class="table-danger">

            <td><c:out value="${products.id}"/></td>
            <td><c:out value="${products.name_product}"/></td>
            <td><c:out value="${products.cost}"/></td>
            <td><a href="/productServlet?actionUser=update&id=${products.id}">Update</a></td>
            <td><a href="/productServlet?actionUser=delete&id=${products.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
