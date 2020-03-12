<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Excluindo com JSTL</title>
</head>
<body>
<sql:setDataSource var="dataSource" 
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/livraria" 
	user="edson" 
	password="americapayment" />

<sql:transaction dataSource="${dataSource}" isolation="read_committed"> 
	<sql:update var="resultado">
		DELETE FROM livros WHERE id = ?
		<sql:param value="${param.id}"/>
	</sql:update>
</sql:transaction>

<c:if test="${resultado>0}">
<h3>O livro de ID ${param.id} foi excluido com sucesso!</h3>
<a href="todos.jsp">Voltar a página principal</a>
</c:if>
</body>
</html>