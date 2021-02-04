/* ************************************************
 *  Java Reskilling - Projeto Capgemini           *
 *	Aula01 - Turma 01                             *
 *	Instrutor: Bruno                              *
 *	ex 01 - baseado na alua de listar filmes      *
 * ************************************************/

package com.capgemini.model.music2;

import java.util.ArrayList;
import java.util.List;

public class MusicaExpert2 {
	
	public List<String> getMusicas(String tipoMusica) {
		List<String> musica = new ArrayList<String>();
		
		switch(tipoMusica) {
			case "rock":
				musica.add("We Will Rock You ");
				musica.add("I Love Rock N’ Roll");
				musica.add("Smells Like Teen Spirit");
				musica.add("Wonderwall");
				break;
			case "pop":
				musica.add("Willow");
				musica.add("Bad Guy");
				musica.add("Pity Party");
				musica.add("Courage to Change");
				break;
			case "alternativo":
				musica.add("Like a Stone");
				musica.add("Fell Good Inc.");
				musica.add("Sex On Fire");
				musica.add("Mr. Brightside");
				break;
			case "mpb":
				musica.add("Porque eu te amo");
				musica.add("Velha infância");
				musica.add("O melhor de mim");
				musica.add("O segundo sol");
				break;
		}
		
		return musica;
	}
	
}
