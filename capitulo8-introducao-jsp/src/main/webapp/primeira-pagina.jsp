<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trabalhando com JavaServer Pages</title>
</head>
<body>

<%
    String s = "<h2>Esse é um código JSP embebido no HTML</h2>";
    out.write(s);
%>

</body>
</html>