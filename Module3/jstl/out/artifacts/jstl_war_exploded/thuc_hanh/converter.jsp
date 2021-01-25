<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    float rate = Float.parseFloat(request.getParameter("rate"));
    float usd = Float.parseFloat(request.getParameter("usd"));

    float vnd = usd * rate;
%>
<h1><%=rate%></h1>
<h1><%=usd%></h1>
<h1><%=vnd%></h1>
</body>
</html>
