<%-- <%@ page import="model.*" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%-- Não é uma boa prática ter código java em arquivos .jsp, pois mistura 
	a regra do negocio com o designer
	<%
		Pessoa p = (Pessoa) request.getAttribute("myPeople");
		Cachorro c = p.getCachorro();
	%>
	<%= p.getNome() %> 
	<%= p.getIdade() %>
	<%= c.getNome() %>
	<%= c.getRaca() %>
--%>

<!-- Standard action, permite que voce acesse o servlet pessoa sem utilizar
	 codigo java -->
	 
<!-- Pega os objetos para eu utilizar, o id, a classe e o escopo
     id é igual a request.getAttribute("myPeople");
     class é igual a import="model.Pessoa"
     scope é igual a informar o tipo de chamada, neste caso é uma requisição - request.comando
 -->
<jsp:useBean id="myPeople" class="model.Pessoa" scope="request" />


<!-- pega o dado para exibir (name é o link com a Servlet, property é o conteudo que quero mostrar 
     property é igual a getNome()
     name é igual a Pessoa p = (Pessoa) request.getAttribute("myPeople");
     ou seja estou fazendo p.getNome() nesta linha debaixo
-->
<jsp:getProperty property="nome" name="myPeople"/>
<br>
<jsp:getProperty property="idade" name="myPeople"/>
<br>
<jsp:getProperty property="cachorro" name="myPeople"/>

</body>
</html>