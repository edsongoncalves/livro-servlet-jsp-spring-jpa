<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usando Expressões em JSP</title>
</head>
<body>
<%!
public String escreveTexto(String texto) {
    String retorno = "<h2>"+texto+"</h2>";
    return retorno;
}

%>
<%= escreveTexto("Aprendendo Java para Web") %>
</body>
</html>