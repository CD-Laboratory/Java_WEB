/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	(codigo copiado e comentado)                  *
 * ***********************************************/

package com.capgemini.model2;

import java.util.ArrayList;
import java.util.List;

public class FilmesExpert {
	// metodo que retorna uma lista de filmes
	// ele tm como parametor a ser passado a categoria do filme
	public List<String> getFilmes(String categoria){
		
		// criando objet do tipo lista 
		List<String> filmes = new ArrayList<String>();
		
		// valida se a categoria recebida é igual as categorias abaixo
		if(categoria.equals("terror")) {
			// adiciona os nomes dos filmes a liste de filmes
			filmes.add("Sexta-feira 13");
			filmes.add("A coisa");
			filmes.add("O chamado");
		} else if(categoria.equals("acao")) {
			filmes.add("Duro de matar");
			filmes.add("John Wick");
			filmes.add("Os Vingadores");
		} else if(categoria.equals("comedia")) {
			filmes.add("Esposa de mentirinha");
			filmes.add("Se beber não case");
			filmes.add("As branquelas");
		} else if(categoria.equals("suspense")) {
			filmes.add("O Silencio dos inocentes");
			filmes.add("Fora de rumo");
			filmes.add("Dragão vermelho");
		}
		
		// retorna uma lista de filmes
		return filmes;
	}
}
