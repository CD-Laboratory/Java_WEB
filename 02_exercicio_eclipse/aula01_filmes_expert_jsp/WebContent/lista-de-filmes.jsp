<%-- 
* *************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	(codigo copiado e comentado)                  *
 * ************************************************
 
 1 - a jsp aceita comandos java e algumas tags adicionais como a diretiva abaixo
 2 - diretiva expecifica da jsp para importar pacotes
 
--%>

<%@ page import="java.util.*" %>

<html>
	<body>
		<h1 align="center"> Lista de Filmes </h1>
		
		<p>
		
		<%-- Dentro desta tag podemos colocar código java --%>
			<%
			    /* aqui eu crio um objeto/variavel de lista, chamada filmes, e pego de request,
			       da classe FilmesServlet, a lista de filmes atraves da variavel
			       listarFilmes */
				List<String> filmes = (List<String>) request.getAttribute("listarFilme");
			
			/* objeto que possibilita iterar a lista em java
			   ou seja ele passa o conteudo da lista de um em um, como um loop 
			   (while, do whie, for..)	
			*/   
				Iterator<String> it = filmes.iterator();
			
			/* aqui ele pergunta para o itarator se existe conteuno dentro da 
			   lista
			*/
			   while(it.hasNext()) {
				 /*se existir ele pega as informacoes da lista e exibe na tela
				  .next() - e para o iterator ir sempre para o proximo da lista
				  ate seu final
				 */
					out.print("<br> filme: " + it.next());
				}

				
			%>
		</p>
	</body>
</html>