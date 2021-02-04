/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	(codigo copiado e comentado)                  *
 * ***********************************************/

//importar blibliotecas
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

// definir nome da classe
public class PrimeiraServlet extends HttpServlet {
	
	// metodo que recebe a requisicao GET
	// o meto recepera dois parametros, request: requisicao e response: resposta
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// define objeto que será responsavel pela saida 
		PrintWriter out = response.getWriter();
		
		// pega a data atual
		java.util.Date today = new java.util.Date();
		
		// printa a saida
		out.println("<html>" + "<body>" + "<h1 align=center> Primeiro Servlet </h1>" + "</br>" + today + "</body>" + "</html>");
	}
}