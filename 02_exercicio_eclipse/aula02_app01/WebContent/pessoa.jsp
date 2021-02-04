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


<%-- N�o � uma boa pr�tica ter c�digo java em arquivos .jsp, pois mistura 
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
     id � igual a request.getAttribute("myPeople");
     class � igual a import="model.Pessoa"
     scope � igual a informar o tipo de chamada, neste caso � uma requisi��o - request.comando
 -->
<jsp:useBean id="myPeople" class="model.Pessoa" scope="request" />


<!-- pega o dado para exibir (name � o link com a Servlet, property � o conteudo que quero mostrar 
     property � igual a getNome()
     name � igual a Pessoa p = (Pessoa) request.getAttribute("myPeople");
     ou seja estou fazendo p.getNome() nesta linha debaixo
-->
<jsp:getProperty property="nome" name="myPeople"/>
<br>
<jsp:getProperty property="idade" name="myPeople"/>
<br>
<jsp:getProperty property="cachorro" name="myPeople"/>

</body>
</html>