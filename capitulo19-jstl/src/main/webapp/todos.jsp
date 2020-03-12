<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>A instrução SQL SELECT através da JSTL</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
</head>
<body>
<sql:setDataSource
	var="dataSource" 
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/livraria"
	user="edson" 
	password="americapayment" />

<sql:query var="livros" dataSource="${dataSource}"> 
	SELECT * FROM livros
</sql:query>

<table border="1">
<tr>
	<th>ID</th>
	<th>Título</th>
	<th>Atualizar</th>
	<th>Excluir</th>
</tr>
	<c:forEach var="livro" items="${livros.rows}"> 
		<tr>
			<td>
				${livro.id}
			</td> 
			<td>${livro.titulo}</td>
			<td>
				<a href="form-update.jsp?id=${livro.id}">
				Atualizar 
				</a>
			</td>
			<td>
				<a href="delete.jsp?id=${livro.id}">
					Excluir 
				</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
