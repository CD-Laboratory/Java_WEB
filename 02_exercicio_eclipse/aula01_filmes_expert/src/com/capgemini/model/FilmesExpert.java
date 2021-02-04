/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	(codigo copiado e comentado)                  *
 * ***********************************************/

package com.capgemini.model;

import java.util.ArrayList;
import java.util.List;

public class FilmesExpert {
	
	// metodo que retorna uma lista de filmes
	// ele tm como parametor a ser passado a categoria do filme
	public List<String> getFilmes(String categoria){
		
		// criando objet do tipo lista 
		List<String> filmes = new ArrayList<String>();
		
		// adiciona os nomes dos filmes a liste de filmes
		filmes.add("Titanic");
		filmes.add("Silencio dos inocentes");
		
		// retorna uma lista de filmes
		return filmes;
	}
}
