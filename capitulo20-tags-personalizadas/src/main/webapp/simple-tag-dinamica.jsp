<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%>
<%@ taglib uri="http://edsongoncalves.com.br/jsp/dinamica" prefix="d" 
%>
<!DOCTYPE html PUBLIC 
"-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>SimpleTag Dinâmica</title>
</head>
<body>
	<d:nome nome="${param['nome']}"/>
	<form action="">
		Nome: <input type="text" name="nome">
		<input type="submit" value="Enviar">
	</form>
</body>
</html>