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
	
	<jsp:setProperty name="data" property="data" value="<%=LocalDate.now()%>"/>
	A data: <strong> 
	<jsp:getProperty name="data" property="data"/>
	</strong>
	<br>

	<jsp:setProperty name="data" property="dataFormatada" value="dd/MM/yyyy"/>
	A data formatada: <strong> 
	<jsp:getProperty name="data" property="dataFormatada"/>
	</strong>
</body>
</html>