package servlets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cachorro;
import model.Pessoa;


public class PessoaServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Diana");
		pessoa.setIdade(30);	
		
		Cachorro cachorro = new Cachorro();
		cachorro.setRaca("pastor alemao");
		cachorro.setNome("Rex");
		
		pessoa.setCachorro(cachorro);
		
		List<Cachorro> cachorros = new ArrayList<>();
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setRaca("Husky");
		cachorro1.setNome("Togo");
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setRaca("Vira-lata");
		cachorro2.setNome("Luna");
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setRaca("Vira-lata");
		cachorro3.setNome("Lila");

		Cachorro cachorro4 = new Cachorro();
		cachorro4.setRaca("Pinscher");
		cachorro4.setNome("Caki");
		
		cachorros.add(cachorro1);
		cachorros.add(cachorro2);
		cachorros.add(cachorro3);
		cachorros.add(cachorro4);
		
		request.setAttribute("myPeople", pessoa);
		request.setAttribute("cachorros", cachorros);
		
		// jsp com standard action
		//RequestDispatcher rd = request.getRequestDispatcher("pessoa.jsp");
		
		//jsp com expression language
		RequestDispatcher rd = request.getRequestDispatcher("pessoa-el.jsp");
		
		rd.forward(request, response);
	}
}
