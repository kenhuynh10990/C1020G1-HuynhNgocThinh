<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/2/2021
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2><strong> Settings</strong></h2>
<form:form action="addEmail" modelAttribute="mail" method="post">
    <table>
        <tr>
            <td>Languages</td>
            <td><form:select path="language">
                <form:options items="${listLanguage}"/>
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize"> Page Size:</form:label></td>
            <td><form:label path="pageSize"> Show <form:select path="pageSize">
                <form:options items="${listPageSize}"/> emails per page
            </form:select></form:label></td>
        </tr>
        <tr>
            <td><form:label path="spamFilter">Spams filter:</form:label></td>
            <td><form:checkbox path="spamFilter" value="Enable spams filter" label="Enable spams filter" /> </td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature:</form:label></td>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <th><input type="submit" value="Update"/></th>
        </tr>
    </table>
</form:form>

</body>
</html>
