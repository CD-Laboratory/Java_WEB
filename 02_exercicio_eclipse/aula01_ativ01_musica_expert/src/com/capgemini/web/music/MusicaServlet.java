/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	ex 01 - baseado na alua de listar filmes      *
 * ************************************************/

package com.capgemini.web.music;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.model.music.MusicaExpert;

public class MusicaServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tipoMusica = request.getParameter("tipoMusica");
		MusicaExpert music = new MusicaExpert();		
		List<String> lMusicas = music.getMusicas(tipoMusica);
		
		request.setAttribute("listarMusica", lMusicas);
		RequestDispatcher reqDis = request.getRequestDispatcher("lista-musicas.jsp");
		reqDis.forward(request, response);
	}
}
