<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	public String nome(){
		return "Jess";
    }
%>

    
<!--     Declaration, joga a variavel no inicio da classe, fora dos metodos,
         não permitindo que ela seja inicializada dentro do metodo -->
	<%! static int contador = 0; %>
	    Contador: 
<!-- Expression, printa a resposta na tela sem o uso do out.print	 -->
	<%= ++contador %>
	
	<br>
		Nome:
		<%= nome() %>
</body>
</html>