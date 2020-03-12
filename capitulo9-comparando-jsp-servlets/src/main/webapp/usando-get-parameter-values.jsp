<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Selecione os programas que você usa</title>
</head>
<body>
<%
	String[ ] musicas = request.getParameterValues("musica"); 

	if(musicas!=null){ 
		out.println("<h2>Você selecionou as seguintes músicas</h2>");
                
		for(String musica: musicas){ 
			out.println( "<strong>"+musica+"</strong><br />" );
		} 
	}
%>
</body>
</html>