<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%>
<%@ taglib uri="http://edsongoncalves.com.br/jsp/condicao" prefix="cond" %>
<!DOCTYPE html>
<html>
<head>
	<title>Trabalhando com Taglibs</title>
</head>
<body>
	
	<cond:if> 
		<cond:condicao>true</cond:condicao>
		<cond:then>O resultado é verdadeiro</cond:then>
		<cond:else>O resultado é falso</cond:else>
	</cond:if>
</body>
</html>