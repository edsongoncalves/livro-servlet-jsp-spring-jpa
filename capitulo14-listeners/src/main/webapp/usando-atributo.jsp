<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Usando Atributo</title>
</head>
<body>
<%
request.setAttribute( "Nome", "Edson" );
request.setAttribute( "Nome", "Luanna" );

%>
${requestScope.Nome="André"}
${requestScope.Nome="Fábio"}

</body>
</html>