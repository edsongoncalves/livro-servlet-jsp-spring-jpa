<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<c:import url="produto.xml" var="produtos" />
<c:import url="produto.xsl" var="xslt" />
<x:transform xml="${produtos}" xslt="${xslt}"/>