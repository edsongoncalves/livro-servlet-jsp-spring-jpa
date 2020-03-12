<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manipulando Coleções com EL</title>
</head>
<body>
	<h2>Manipulando Coleções</h2>
	<p>
		<strong>Imprimindo os valores no stream:</strong>
		${["Brasil", "Argentina", "Paraguai", "Uruguai", "Chile"].stream().toList()}
	</p>
	<p>
		<strong>Limitar os 3 primeiros valores:</strong>    
		${["Brasil", "Argentina", "Paraguai", "Uruguai", "Chile"].stream().limit(3).toList()}
	</p>
	<p>
		<strong>Ordem alfabética:</strong>  
		${["Brasil", "Argentina", "Paraguai", "Uruguai", "Chile"].stream().sorted().toList()}
	</p>
	<p>
		<strong>Ordem numérica crescente:</strong>
		${[10, 6, 7, 3, 1, 4, 5,0].stream().sorted().toList()}
	</p>
	<p>
		<strong>Média aritmética:</strong>
		${[5, 10, 5, 3].stream().average().get()}
	</p>
	<p>
		<strong>Somando valores:</strong>
		${[5, 10, 5, 3].stream().sum()}
	</p>
	<p>
		<strong>Contar elementos no stream:</strong>
		${["Brasil", "Argentina", "Paraguai", "Uruguai", "Chile"].stream().count()}
	</p>
	<p>
		<strong>Valor mínimo:</strong>
		${[5, 10, 5, 3].stream().min().get()}
	</p>
	<p>
		<strong>Valor máximo:</strong>
		${[5, 10, 5, 3].stream().max().get()}
	</p>
</body>
</html>