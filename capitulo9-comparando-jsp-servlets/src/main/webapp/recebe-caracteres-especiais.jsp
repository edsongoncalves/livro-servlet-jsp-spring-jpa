<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recebendo Caracteres Especiais</title>
</head>
<body>
<% 
	String dados = request.getParameter("dados");
%>
	Você enviou os seguintes dados: <strong><%=dados%></strong>
	<br>


	A query string passada foi:<br>
	<strong><%=request.getQueryString( )%></strong>

</body>
</html>