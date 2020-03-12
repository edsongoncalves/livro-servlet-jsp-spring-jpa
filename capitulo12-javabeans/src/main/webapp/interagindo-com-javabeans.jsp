<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Interagindo com o Usuário usando JavaBeans</title>
</head>
<body>
	<jsp:useBean id="usuario" class="meupacote.Usuario" />
	<jsp:setProperty name="usuario" property="*" />  
	Seu nome completo é: <strong>
		<jsp:getProperty name="usuario" property="nomeCompleto" />
	</strong>
	<form method="post" action="interagindo-com-javabeans.jsp">
     		Nome: <input type="text" size="20" name="nome"> 
     		<br>
     		Sobrenome: <input type="text" size="20" name="sobrenome"> 
     		<br>
     		<input type="submit" name="submit" value="Enviar">
	</form>
</body>
</html>