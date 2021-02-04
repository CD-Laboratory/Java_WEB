package com.capgemini.revisao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.revisao.model.Musica;
import com.capgemini.revisao.model.RevisaoModel;

public class RevisaoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Musica> musicas = RevisaoModel.getMusicas();
		
		request.setAttribute("listaMusicas", musicas);
		
		RequestDispatcher rd = request.getRequestDispatcher("teste-jstl.jsp");
		rd.forward(request, response);
	}
}
