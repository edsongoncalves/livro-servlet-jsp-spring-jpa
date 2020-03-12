<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Recebendo dados via POST com JSP</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	</head>
	<body>
		<% 
			String usuario = request.getParameter("usuario");     
			String senha = request.getParameter("senha");
		        
			if(usuario.equals("edson") && senha.equals("123")){
				out.println( "Seja bem vindo Edson" );
			}
			else{
				out.println( "Usuário ou senha inválidos" );
			}   
		 %>
	</body>
</html>