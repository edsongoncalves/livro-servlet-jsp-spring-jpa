<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLEncoder"
%> 
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Enviando Caracteres Especiais Usando JSP</title>
</head>
<body>
<%
	String queryString = URLEncoder.encode("Gonçalves&Gonçalves","UTF-8");
%>
	<a href="recebe-caracteres-especiais.jsp?dados=<%=queryString %>">
		Clique aqui para enviar
	</a>

</body>
</html>