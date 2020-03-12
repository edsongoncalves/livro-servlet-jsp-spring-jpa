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
	${ (not empty param['nome'])? 
		"Seu nome completo é " += param['nome'] += " " += param['sobrenome']
		: ""  
	}
	
	
	<form method="post" action="usando-el-para-recuperar-valores.jsp">
		Nome: <input type="text" size="20" name="nome"> 
		<br>
		Sobrenome: <input type="text" size="20" name="sobrenome"> 
		<br>
		<input type="submit" name="submit" value="Enviar">
	</form>
</body>
</html>