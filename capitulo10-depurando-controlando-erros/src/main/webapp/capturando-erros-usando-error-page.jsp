<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="error_page.jsp"
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" 
	content="text/html; charset=UTF-8">
<title>Tratando Erros</title>
</head>
<body>
<%
	String val1 = request.getParameter("val1");
	String val2 = request.getParameter("val2");
	int valor1 = Integer.getInteger(val1);
	int valor2 = Integer.getInteger(val2);
%>

</body>
</html>