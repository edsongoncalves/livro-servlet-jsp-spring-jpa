<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Trabalhando com EL e Expressões Lambda</title>
</head>
<body>
<h2>EL com Lambda</h2>

Uma soma de 10+12: 
<strong> 
${soma = (val1,val2)->val1+val2; soma(10,2) }
</strong>
<br>
Um exemplo de cálculo 1 + 5 * 10 - 3 / 2: 
<strong> 
${calculo = (val1,val2, val3, val4, val5)->val1+val2*val3-val4/val5; 
	calculo(1,5,10,3,2)
}
</strong><br>



</body>
</html>