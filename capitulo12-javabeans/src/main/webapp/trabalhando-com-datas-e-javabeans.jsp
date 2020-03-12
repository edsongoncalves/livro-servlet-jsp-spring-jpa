<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.time.LocalDate"
 %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usando JavaBeans para formatar datas</title>
</head>
<body>
<jsp:useBean id="data" class="meupacote.FormatandoDatas"/>
<% data.setData(LocalDate.now()); %> 
A data: <strong> <%= data.getData() %></strong><br>

<% data.setDataFormatada("dd/MM/yyyy"); %> 
A data formatada: <strong> <%= data.getDataFormatada() %></strong>
</body>
</html>