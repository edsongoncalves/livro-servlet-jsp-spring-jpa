<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
 %>
 <%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<title>Trabalhando com Tags Personalizadas</title>
</head>
<body>
<form>
	<t:inputag nome="nome" rotulo="Nome:" tipo="text" />
	<br>
	<t:inputag nome="senha" rotulo="Senha:" tipo="password" />
</form>
</body>
</html>