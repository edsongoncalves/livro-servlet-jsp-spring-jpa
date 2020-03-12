<%@ page language="java" contentType="text/html"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://edsongoncalves.com.br/jsp/repeticao" prefix="r" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Trabalhando com Taglibs</title>
</head>
<body>
	<r:repeticao contar="5"> 
		<h3>Repetindo cinco vezes</h3>
	</r:repeticao>
</body>
</html>