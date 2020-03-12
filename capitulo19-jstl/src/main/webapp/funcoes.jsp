<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<title>Trabalhando com functions em JSTL</title>
</head>
<body>
<c:set var="nome" value="Edson Gon�alves"/>
<c:set var="html" value="Tags <br> n�o s�o um problema"/>
Deve retornar true:
${fn:contains(nome, "Gon�alves")}

<br />
Deve retornar true:
${fn:containsIgnoreCase(nome, "EDsoN")}

<br />
Deve retornar true: ${fn:startsWith(nome, "Edson")}

<br />
Deve retornar true: 
${fn:endsWith(nome, "Gon�alves")}
<br />
Com escapeXML:
${fn:escapeXml(html)}
<br />
Sem escapeXML: ${html}
<br />

Deve retornar 12: ${fn:indexOf(nome, "ves")}

<br />
Deve retornar 15: ${fn:length(nome)}

<br />
Ficar� Edson G: ${fn:replace(nome, "Gon�alves", "G")}

<br />
Deve retornar Edson: ${fn:substring(nome, 0, 5)}

<br />
Remove espa�os: ${fn:trim(" Edson Gon�alves ")}

<br />
Em mai�suclas: ${fn:toUpperCase(nome)}

<br />
Em min�sculas: ${fn:toLowerCase(nome)}
</body>
</html>