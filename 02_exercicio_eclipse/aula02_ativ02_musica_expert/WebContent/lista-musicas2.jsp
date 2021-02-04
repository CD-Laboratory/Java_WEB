<%-- 
* *************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	ex 01 - baseado na alua de listar filmes      *
 * ************************************************
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> Lista de Músicas </h1>
	
	Musicas:
	<br>
	<table>
		<c:forEach var="music" items="${listarMusica}"> 
		 <tr>
			<td>${music}</td>
		 </tr>
		</c:forEach>
	</table>
</body>
</html>