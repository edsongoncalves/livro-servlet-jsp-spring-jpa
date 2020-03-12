<%@ page language="java" 
	contentType="text/html;"
	pageEncoding="ISO-8859-1"
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Desenvolvendo com JSTL e EL</title>
</head>
<body>
	<c:set var="email" value="edson@edsongoncalves.com.br"/>
    
	Seu e-mail é: <strong>${email}</strong> 
</body>
</html>