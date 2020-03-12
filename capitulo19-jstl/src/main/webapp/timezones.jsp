<%@ page language="java" 
	contentType="text/html"
	pageEncoding="ISO-8859-1"
%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<Title>Usando a action timeZone</title>
</head>
<body>
<jsp:useBean id="data" class="java.util.Date" />
<table border="1">
	<c:forEach var="timezone" items="<%=java.util.TimeZone.getAvailableIDs( )%>">
		<Tr>
			<td width="51%">
				<c:out value="${timezone}" />
			</td>
			<td width="49%">
				<fmt:timeZone value="${timezone}">
					<fmt:formatDate value="${data}" timeZone="${zn}" type="both" />
				</fmt:timeZone>
			</td>
		</tr>
      </c:forEach>
</table>
</body>
</html>