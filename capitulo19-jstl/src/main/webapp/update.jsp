<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>    
<!DOCTYPE html>
<html>
<head>
<title>Dados atualizados</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
</head>
<body>
<sql:setDataSource var="dataSource" 
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/livraria" 
	user="edson" password="americapayment" />
    
<sql:update var="resultado" dataSource="${dataSource}">
	UPDATE livros SET titulo=? WHERE id=?
	<sql:param value="${param.titulo}" />
	<sql:param value="${param.id}" />   
</sql:update>

<c:if test="${resultado>0}">

<h3>Os dados foram atualizados com sucesso!</h3>
<a href="todos.jsp">Voltar para a página principal</a>

</c:if>
</body>
</html>