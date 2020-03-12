<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Formata��es de data, hora, n�mero e moeda</title>
</head>
<body>
	<h2>Formata��o atual baseada no locale do Browser</h2>
	<jsp:useBean id="data" class="java.util.Date" />
	Data padr�o : <fmt:formatDate value="${data}"/><br>
	Somente a data no formato dd/MM/yyyy :
	<fmt:formatDate value="${data}" type="DATE" pattern="dd/MM/yyyy"/>
	<br>
	A hora: <fmt:formatDate value="${data}" type="TIME" dateStyle="default"/>
	<h2>Formata��o de data usando o TimeZone na pr�pria action</h2>
	<fmt:formatDate value="${data}" type="BOTH" timeZone="pt_BR"/>
	<h2>Formatando no padr�o Los Angeles Time Zone</h2>
	<fmt:setLocale value="en_US"/>
	<fmt:timeZone value="America/Los_Angeles"> 
		Formato Padr�o : <fmt:formatDate value="${data}"/><br>
		Data no formato MM-dd-yyyy :
		<fmt:formatDate value="${data}" type="DATE" pattern="MM-dd-yyyy"/>
		<br>
		Hora estilo SHORT:
		<fmt:formatDate value="${data}" type="TIME" timeStyle="SHORT"/>
		<br>
	</fmt:timeZone> 
	<hr />
	<h2>Formata��o de Moeda for�ando o Locale</h2>
	<c:set var="salario" value="5000" />
	<fmt:setLocale value="en_US"/>
	<fmt:formatNumber type="CURRENCY" value="${salario}" />
	<br>
	<fmt:setLocale value="pt_BR"/>
	<fmt:formatNumber type="CURRENCY" value="${salario}" />
	<br>
	<hr>
	<h2>Formata��o de N�meros acompanhando o locale for�ado em setLocale</h2>
	<c:set var="numero" value="1000" />
	<fmt:formatNumber type="NUMBER" groupingUsed="true" minFractionDigits="2"  value="${numero}" />
	<hr>
	<h2>Formata��o de Porcentagem</h2>
	<c:set var="porcentagem" value="0.05" />
	<fmt:formatNumber type="PERCENT" value="${porcentagem}" />


</body>
</html>