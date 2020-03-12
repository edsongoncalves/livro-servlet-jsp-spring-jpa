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
<c:set var="nome" value="Edson Gonçalves"/>
<c:set var="html" value="Tags <br> não são um problema"/>
Deve retornar true:
${fn:contains(nome, "Gonçalves")}

<br />
Deve retornar true:
${fn:containsIgnoreCase(nome, "EDsoN")}

<br />
Deve retornar true: ${fn:startsWith(nome, "Edson")}

<br />
Deve retornar true: 
${fn:endsWith(nome, "Gonçalves")}
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
Ficará Edson G: ${fn:replace(nome, "Gonçalves", "G")}

<br />
Deve retornar Edson: ${fn:substring(nome, 0, 5)}

<br />
Remove espaços: ${fn:trim(" Edson Gonçalves ")}

<br />
Em maiúsuclas: ${fn:toUpperCase(nome)}

<br />
Em minúsculas: ${fn:toLowerCase(nome)}
</body>
</html>