package com.capgemini.revisao.model;

import java.util.ArrayList;
import java.util.List;

public class RevisaoModel {

	public static List<Musica> getMusicas(){
		List<Musica> musicas = new ArrayList<>();
		
		Musica musica1 = new Musica("Paranoid", "Black Sabbath", 120);
		Musica musica2 = new Musica("The end", "Black Sabbath", 180);
		Musica musica3 = new Musica("War Pigs", "Black Sabbath", 150);
		Musica musica4 = new Musica("Whiskey in the Jar", "Metallica", 150);
		
		musicas.add(musica1);
		musicas.add(musica2);
		musicas.add(musica3);
		musicas.add(musica4);
		
		return musicas;
	}
}
