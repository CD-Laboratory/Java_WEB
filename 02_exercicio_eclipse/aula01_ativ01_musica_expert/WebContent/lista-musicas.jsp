<%-- 
* *************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	ex 01 - baseado na alua de listar filmes      *
 * ************************************************
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> Lista de Músicas </h1>
	<p>
		<%
			List<String> musicas = (List<String>) request.getAttribute("listarMusica");
			Iterator<String> itM = musicas.iterator();
			
			while(itM.hasNext()){
				out.print("<br> Nome da música: " + itM.next());
			}
		%>
	</p>
</body>
</html>