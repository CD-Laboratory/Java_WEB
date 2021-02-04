/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	(codigo copiado e comentado)                  *
 * ***********************************************/

package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DadosServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// variavel responsavel pela saida
		PrintWriter out = response.getWriter();
		
		// metodo math.random apresenta numeros aleatorios de 0 a 6
		// ao somar + 1 eu elimino o zero, então a classe ira apresentar numeros de 1 a 6
		// integer.tostring converte o numero em string
		// o cast, realizado com o (int), significa que estou forçando o numero aleatorio que virá ser um inteiro, e não um numero quebrado
		String dado01 = Integer.toString((int) (Math.random() * 6) + 1);
		String dado02 = Integer.toString((int) (Math.random() * 6) + 1);
		
		// imprimindo a saida
		out.println("<html>" + "<body>" + "<h1 align=center> Dados Servlet </h1>" + "</br>" + dado01 + " e " + dado02  + "</body>" + "</html>");
	}
}
