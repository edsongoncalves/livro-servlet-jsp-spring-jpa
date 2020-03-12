<%@ page language="java" 
	contentType="text/html"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<title>Formulário para Atualização</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
</head>
<body>

<sql:setDataSource var="dataSource" 
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/livraria" 
	user="edson" password="americapayment" />
    
<sql:query var="livros" dataSource="${dataSource}">
	SELECT * FROM livros WHERE id=?
	<sql:param value="${param.id}" />
</sql:query>

<c:set var="livro" value="${livros.rows[0]}" />


<form action="update.jsp" method="post">
	ID: <input type="text" name="id" value="${livro.id}" readonly>
	<br>
	Título: <input type="text" name="titulo" value="${livro.titulo}">
	<br> <br>
	<input type="submit" name="atualizar" value="Atualizar">
    
</form>

</body>
</html>