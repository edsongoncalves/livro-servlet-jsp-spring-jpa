<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" 
		content="text/html; charset=UTF-8">
	<title>Erro na execução da sua página JSP</title>
</head>
<body>
	<h2>Erro na execução da sua página JSP</h2>
	Um erro ocorreu no seu sistema. Verifique a seguir a possibilidade de 
	executar novamente a página corrigindo suas falhas:
	<strong>
	<%= exception.toString( ) %> 
	</strong>
</body>
</html>