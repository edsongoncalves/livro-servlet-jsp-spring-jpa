<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String conteudo = (String) request.getAttribute("conteudo"); 
%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><%=conteudo%></title>
</head>
<body>
<%	
	out.print(String.format("<h1>%s</h1>", conteudo)); 
	
%>
</body>
</html>