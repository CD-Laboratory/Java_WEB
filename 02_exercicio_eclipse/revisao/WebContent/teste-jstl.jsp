<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teste JSTL</title>
</head>
<body>

	<!-- tutorial
		https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm
	  -->
	
	<c:forEach var="musica" items="${listaMusicas}">
		Musica: ${musica.nome} <br>
		Compositor: ${musica.compositor} <br>
		Duração em segundos: ${musica.duracaoSegundos} <br>
	
	<!-- este comando seria o if do java
	     duracaoSegundos ge 150 significa o >= do java
	     esta condicao seria uma regra de negoco, por isso deve ser evitada ao maximo na jstl (SOLID)
	 -->	
		<c:if test="${musica.duracaoSegundos >= 150}">
			Música longa <br>
		</c:if>
	
		<c:if test="${musica.duracaoSegundos <= 120}">
			Música curta <br>
		</c:if>
			
		<c:if test="${fn:startsWith(musica.compositor, 'Black')}">
			Heavy Metal<br>
		</c:if>
		
		<c:set var="nomeMusica" value="${fn:toUpperCase(musica.nome)}" /> 
	    <p> Nome maiusculo: ${nomeMusica}</p> 
		
		<c:choose>
			<c:when test="${musica.duracaoSegundos ge 150}">
			  Usando chooser: Música longa  <br>
			</c:when>
			
			<c:otherwise>
			   Usando chooser: Música curta <br>
			</c:otherwise>
			
		</c:choose>
		=============================================================
		<br>
	</c:forEach>

</body>
</html>