<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Usando a action catch</title>
</head>
<body>
	<c:url value="http://www.edsongoncalves.com.br/livros.jsp" var="url" >
		<c:param name="isbn" value="123456" />
	</c:url>
	<br>
	<strong>O resultado da URL é:</strong>
	${url}
</body>
</html>