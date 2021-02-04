/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	(codigo copiado e comentado)                  *
 * ***********************************************/

package com.capgemini.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.model2.FilmesExpert;

public class FilmesServlet extends HttpServlet {
	// o post e o metodo padrao de envio de formulario
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		// a variavel categoria recebe a informação de categoria do filme pelo cliente atraves 
		// do metodo getParameter da varivel request
		String categoria = request.getParameter("categoria");
		
		// cria objeto da classe FilmesExpert
		FilmesExpert filmesExpert = new FilmesExpert();
		
		//cria uma lista de filmes do tipo string
		// recebe a lista de filmes da classe FilmesExpert
		List<String> filmes = filmesExpert.getFilmes(categoria);
	
		/* metodo que ira inserir as informacoes da lista de filmes no request, 
		   associando o nome listarFilme a lista de filmes recebida da classe
		   FilmesExpert 
		*/
		request.setAttribute("listarFilme", filmes);
		
		/*  cria objeto da classe RequestDispatcher que ira receber as informacoes do
		 *  metodo request para enviar a pagina .jsp (lista-de-filmes.jsp)
		 */
		RequestDispatcher requestDispatcher =  request.getRequestDispatcher("lista-de-filmes.jsp");
		
		/* o metodo forward envia a requisicao para a JSP para que ela gere a 
		  resposta ao cliente */
		requestDispatcher.forward(request, response);

	}
}
