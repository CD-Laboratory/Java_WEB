<%@ page import="foo.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Contador:
	
	<br>
	
	<%
		out.println(Contador.getCount());
	%>
	
	<br>
	
	<%-- o %= nao precisa do out.print para  exibira na tela --%>
	<%= Contador.getCount() %>
	
</body>
</html>