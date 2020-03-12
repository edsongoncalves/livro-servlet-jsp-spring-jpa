<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Trabalhando com Expression Language</title>
</head>
<body>
<h2>Expressões Aritméticas</h2>
	Um exemplo de cálculo 1 + 5 * 10 - 3 / 2: 
	<strong> 
		${1 + 5 * 10 - 3 / 2} 
	</strong><br>
	Um valor negativo (-5 -8): 
	<strong> 
		${-5 - 8}
	</strong><br>
	Uma divisão usando div: 
	<strong> 
		${6 div 2}
	</strong><br>
	O resto de uma divisão (10%8): 
	<strong>
		${10 % 8}
	</strong>
	<h2>Comparações</h2>
	<h3>Utilizando Boolean</h3>
	Uma comparação usando operador ternário "? :" : 
	<strong>
		${(true) ? "verdadeiro" : "falso"} 
	</strong>
	<h2>Operador empty</h2>
	empty "" : 
	<strong>
		${empty ""}
	</strong><br>
	empty "texto" : 
	<strong>
		${empty "texto"}
	</strong><br>
	<h2>Valor Null</h2>
	null == null : 
	<strong>
		${null == null}
	</strong><br>
	"null" == null : 
	<strong> 
		${"null" == null}
	</strong><br>
</body>
</html>