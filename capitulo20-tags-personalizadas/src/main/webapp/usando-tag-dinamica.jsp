<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
 %>
 <%@ taglib tagdir="/WEB-INF/tags" prefix="d" %>
<!DOCTYPE html>
<html>
<head>
<Title>A tag dinâmica personalizada</title>
</head>
<body>
<form>
	<d:tagdinamica nome="estados" 
		opcoes="SP, RJ, MG, PR, RS, ES" 
		delimitadores=" ," 
		tamanho="3" 
		multiplo="true" />
</form>
</body>
</html>