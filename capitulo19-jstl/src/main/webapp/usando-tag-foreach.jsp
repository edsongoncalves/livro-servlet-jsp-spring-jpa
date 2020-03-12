<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Usando a action forEach</title>
</head>
<body>
	<c:set var="str" value="A,B,C,D,E" />
	<strong>A vari�vel ${'${'}str }:</strong>
	<br>
	<c:out value="${str}" />
	<br>
	<strong>Usando forEach em uma cole��o:</strong>
	<br>
	<c:forEach var="letras" items="${str}"> 
		<c:out value="${letras}" />
		<br>
	</c:forEach>
	<br>
	<strong>Usando forEach de 1 at� 10:</strong>
	<br>
	<c:forEach var="i" begin="1" end="10">
		<c:out value="${i}" />
		<br>
	</c:forEach>
	<br>
	<strong>Usando forEach para n�meros pares de 2 at� 10:</strong>
	<br>
	<c:forEach var='i' begin='2' end='10' step='2'> 
		<c:out value='${i}'/>
		<br>
	</c:forEach>
</body>
</html>