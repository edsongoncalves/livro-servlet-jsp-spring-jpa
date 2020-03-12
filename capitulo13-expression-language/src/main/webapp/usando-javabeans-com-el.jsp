<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usando Expression Language com JavaBeans</title>
</head>
<body>
	<jsp:useBean id="usuario" class="meupacote.Usuario" scope="request">
		<jsp:setProperty name="usuario" property="*"/>
	</jsp:useBean>

	
	Seu nome é: <strong>${usuario["nome"]}</strong><br> 
	Seu e-mail é: <strong>${usuario.email}</strong>

	<form action="${pageContext.request.requestURI}" method="post">
		Nome: <input type="text" name="nome"><br>
		E-mail: <input type="text" name="email"><br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>