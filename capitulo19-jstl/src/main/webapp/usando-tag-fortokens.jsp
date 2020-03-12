<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>A action forTokens</title>
</head>
<body>
<form method="post" action="${pageContext.request.requestURI}">
	<h3>Digite a sequencia de dados:</h3>
	<input width="20" name="palavras" value="${param.palavras}">
	<br>
	<input type="submit" name="enviar" value="Enviar">
</form>
<br>
<c:if test="${pageContext.request.method=='POST'}">
	<table border="1">
		<c:set var="i" value="1" />
		<c:forTokens items="${param.palavras}" var="palavra" delims=" -;,">
			<tr>
				<td><strong>Palavra <c:out value="${i}" /> </strong></td>
				<c:set var="i" value="${i+1}" />
				<td><c:out value="${palavra}" /></td>
			</tr>
		</c:forTokens>
    </table>
</c:if>
</body>
</html>