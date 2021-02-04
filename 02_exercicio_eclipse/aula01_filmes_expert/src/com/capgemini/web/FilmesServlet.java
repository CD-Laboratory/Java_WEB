/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	(codigo copiado e comentado)                  *
 * ***********************************************/

package com.capgemini.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.model.FilmesExpert;

public class FilmesServlet extends HttpServlet {
	
	// o post e o metodo padrao de envio de formulario
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// a variavel categoria recebe a informação de categoria do filme pelo cliente atraves 
		// do metodo getParameter da varivel request
		String categoria = request.getParameter("categoria");
		
		// cria objeto da classe FilmesExpert
		FilmesExpert filmesExpert = new FilmesExpert();
		
		//cria uma lista de filmes do tipo string
		// recebe a lista de filmes da classe FilmesExpert
		List<String> filmes = filmesExpert.getFilmes(categoria);
		
		// informa que o texto enviado sera do tipo html
		response.setContentType("text/html");
		
		// objeto responsavel pela saida
		PrintWriter out = response.getWriter();
		out.print("Lista de filmes: ");
		
		// objeto que possibilita iterar a lista em java
		// ou seja ele passa o conteudo da lista de um em um, como um loop (while, do whie, for..)
		Iterator<String> iterator = filmes.iterator();
		
		// aqui ele pergunta para o itarator se existe conteuno dentro da lista
		while(iterator.hasNext()) {
			
			//se existir ele pega as informacoes da lista e exibe na tela
			//.next() - e para o iterator ir sempre para o proximo da lista ate seu final
			out.print("<br> filme: " + iterator.next());
		}
	}
}
