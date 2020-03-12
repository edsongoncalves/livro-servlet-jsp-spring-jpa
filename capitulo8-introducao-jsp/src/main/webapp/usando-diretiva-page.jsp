<%@ page language="java"  
	contentType="text/html"
	pageEncoding="UTF-8"
	info="Escrito por Edson Gonçalves"
	import="java.util.Date"
	import="java.text.SimpleDateFormat"
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usando a Diretiva page</title>
</head>
<body>
    Esse é um exemplo da utilização da diretiva <strong>page</strong>
    <br>
    <%
     Date hoje = new Date( );
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");  
    %>
    A data de hoje é: <strong><%= formato.format(hoje) %></strong>.
</body>
</html>