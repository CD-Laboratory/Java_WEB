<!-- importando o jstl, o prefix c e padrao, o c significa core -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- usando expression language
    dentro dele você pega o "id" do 
    request.setAttribute("myPeople", pessoa)
	. mais o nome da variavel que você quer mostrar
 -->
 
Nome pessoa:  ${myPeople.nome} 
<br>
Idade pessoa: ${myPeople.idade}
<br>
Nome do cachorro: ${myPeople.cachorro.nome} 
<br>
Raça do cachorro: ${myPeople.cachorro.raca} 
<br>

==============================================
<br>
Terceiro cachorro: <br>
${cachorros[2].nome} <br>
${cachorros[2].raca}
<br>
==============================================
<br>
Primeiro cachorro: <br>
${cachorros[0].nome} <br>
${cachorros[0].raca} 
<br>

==============================================
<br>
Segundo cachorro: <br>
${cachorros[1].nome} <br>
${cachorros[1].raca}
<br>
==============================================

<table>
    <!-- c (padrao) é o nome que foi dado no prefix ao chamar o jstl -->
    
    <!-- este comando é um loop
    	o var é a variavel que ira receber os dados
    	items é o é o nome do id lista, criada na servlet ao fazer o request.setAttribute  	 
     -->
	<c:forEach var="dog" items="${cachorros}">
	
	<!-- aqui ele vai inserir na tabela até não ter mais nada na lista -->
		<tr>
			<td>${dog.nome}</td>
			<td>${dog.raca}</td>
			<td>
			    <!-- comando que representa o if/else do java 
			         o comando com when seria a condicao dentro do if
			         caso a condicao e verdadeira a frase dentro dele e escrita
			    -->
				<c:choose>
					<c:when test="${dog.raca == 'Pinscher'}">
					  Parece bravo mais nao faz nada
					</c:when>
				</c:choose>
			</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>