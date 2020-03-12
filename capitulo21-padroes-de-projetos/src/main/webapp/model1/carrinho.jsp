<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros adquiridos</title>
</head>
<body>
<jsp:useBean id="carrinho" scope="session" class="meupacote.CarrinhoBean" />
<jsp:setProperty name="carrinho" property="*" />


<c:if test="${param.livro != null}"> 
		${carrinho.processa(param.livro)}
	
</c:if>

<c:if test="${not carrinho.produtos.isEmpty()}">
<table border="1">
	<tr>
		<th colspan="2">Carrinho de Compras</th>
	</tr>
<c:forEach var="livro" items="${carrinho.produtos}"> 
	<tr>
		<td>${livro}</td>
		<td><a href="?livro=${livro}&cmd=r">Excluir</a></td>
	</tr>
</c:forEach>
	<tr>
		<td colspan="2"><a href="produtos.jsp">Comprar mais</a>
		</td>
	</tr>

</table>
</c:if>
<c:if test="${carrinho.produtos.isEmpty()}"> 
<h2>Você não tem produtos no seu carrinho</h2>
<a href="produtos.jsp">Comprar produto</a>
</c:if>

</body>
</html>