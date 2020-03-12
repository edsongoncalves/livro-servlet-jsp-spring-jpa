<%@ page language="java" contentType="text/html"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://edsongoncalves.com.br/jsp/personalizada" prefix="p" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Trabalhando com Taglibs</title>
</head>
<body>
	<form action="index.jsp" method="post" >
		Usuário: <p:inputTag name="usuario" type="text" /><br>  
		Senha: <p:inputTag name="senha" type="password" /><br>
		<p:inputTag name="enviar" type="submit" value="Enviar" />

	</form>
</body>
</html>