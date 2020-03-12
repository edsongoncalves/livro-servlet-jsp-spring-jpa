<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<title>Manipulando o XML através da biblioteca JSTL</title>
</head>
<body>
<fmt:setLocale value="pt_BR"/>
<c:import url="produto.xml" var="arquivoxml" />

<x:parse xml="${arquivoxml}" var="arquivo" scope="application" />
<table border="1">
	<tr>
		<th>ID</th><th>Nome</th><th>Preço</th>
	</tr>
	<x:forEach select="$arquivo/produtos/produto" var="produto"> 
	<!--  x:if select="$produto/id='2'"-->
	
	<x:choose>
		<x:when select="$produto/id mod 2 = '1'">
			<c:set var="cor" value="#CCCCCC" />
		</x:when>
		<x:otherwise>
			<c:set var="cor" value="#FFFFFF" />
		</x:otherwise>
	</x:choose>	
	
	
	<tr  bgcolor="${cor}">
		<td>
			<x:out select="$produto/id"/> 
		</td>
		<td>
			<x:out select="$produto/nome"/></td>
		<td>
    			<fmt:formatNumber type="CURRENCY">
				<x:out select="$produto/preco"/>
			</fmt:formatNumber>
		</td>
	</tr>
	<!-- /x:if-->
	</x:forEach>
</table>

</body>
</html>