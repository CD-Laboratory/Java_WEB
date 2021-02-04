<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado</title>
</head>
<body>

<!-- ele cria um objeto (pessoa), que não existe ainda,  e joga no id  -->
	<jsp:useBean id="pessoa" class="model.Pessoa">
	
<!-- seta o valor no objeto pessoa 
   ao passar o * para property ele vai pegar todas as propriedades (variaveis) dentro da classe
   (mais para funcionar os nomes do formulario e da classe devem ser iguais)
-->	
		<jsp:setProperty name="pessoa" property="*" />
	</jsp:useBean>
	
	<jsp:getProperty property="nome" name="pessoa"/>
	<br>
    <jsp:getProperty property="idade" name="pessoa"/>
</body>
</html>