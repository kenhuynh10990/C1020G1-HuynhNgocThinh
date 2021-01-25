<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    Map<String,String> dic=new HashMap<>();
%>
<%
dic.put("Hello","xin chao");
dic.put("Hi","xin chao");
dic.put("book","sach");
String search= request.getParameter("world");
String result = dic.get(search);
if (result!=null){
    out.println("World:"+search);

    out.println(" Result:"+result);
} else {
    out.println("Not found");
}
%>
</body>
</html>
