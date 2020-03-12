<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usando meu primeiro JavaBean</title>
</head>
<body>
	<jsp:useBean id="primeirojb"
		class="meupacote.MeuPrimeiroJavaBean"/>
	A mensagem atual é 
	<strong>
		<%= primeirojb.getMensagem( ) %>
	</strong>
	<br>
	A mensagem, depois de adicionada é:<br>
	<strong>
		<%
			primeirojb.setMensagem("Meu primeiro JavaBean");
			out.println(primeirojb.getMensagem( ));
		%>
	</strong>
</body>
</html>