<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trabalhando com Expression Language</title>
</head>
<body>
	<h3>Usando forEach</h3>

	${ dados.stream().sorted().forEach( d->  pageContext.out.println(d+="<br>")) }
	
	<h3>Usando String.join</h3>
	${String.join("<br>", dados.stream().sorted().toList() ) }

</body>
</html>