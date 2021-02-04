/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	ex 01 - baseado na alua de listar filmes      *
 * ************************************************/

package com.capgemini.web.music2;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.model.music2.MusicaExpert2;

public class MusicaServlet2 extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tipoMusica = request.getParameter("tipoMusica");
		MusicaExpert2 music = new MusicaExpert2();		
		List<String> lMusicas = music.getMusicas(tipoMusica);
		
		request.setAttribute("listarMusica", lMusicas);
		RequestDispatcher reqDis = request.getRequestDispatcher("lista-musicas2.jsp");
		reqDis.forward(request, response);
	}
}
