<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:forward page="redirecionado.jsp">
    <jsp:param name="texto" value="Esse texto veio da página que redirecionava" /> 
</jsp:forward>