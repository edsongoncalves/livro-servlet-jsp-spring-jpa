<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trabalhando com Objetos Implícitos na EL</title>
</head>
<body>
<table border="1">
	<tr>
		<td>Objeto</td>
		<td>Código usado</td>
		<td>Saída</td>
	</tr>
	<tr>
		<td>PageContext</td>
		<td>${'${'}pageContext.request.requestURI}</td>
		<td>${pageContext.request.requestURI}</td>
	</tr>	
	<tr>
		<td>param</td>
		<td>${'${'}param["varios"]}</td>
		<td>${param["varios"]}</td>
	</tr>
	<tr>
		<td>paramValues</td>
		<td>${'${'}paramValues.varios[1]}</td>
		<td>${paramValues.varios[1]}</td>
	</tr>
</table>

</body>
</html>