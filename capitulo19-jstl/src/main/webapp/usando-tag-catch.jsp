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
	<c:catch var="e"> 
		<jsp:include page="nao-existe.jsp"  />
	</c:catch>

	<c:choose> 
		<c:when test="${e!=null}">
			A exceção é: ${e}<br>
		</c:when>
		<c:otherwise> 
			Sem exceção
		</c:otherwise>
	</c:choose>
</body>
</html>