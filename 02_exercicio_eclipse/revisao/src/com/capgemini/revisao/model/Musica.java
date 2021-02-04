package com.capgemini.revisao.model;

public class Musica {
	
	private String nome;
	private String compositor;
	private int duracaoSegundos;
	
	public Musica() {}
	
	public Musica(String nome, String compositor, int duracaoSegundo) {
		this.nome = nome;
		this.compositor = compositor;
		this.duracaoSegundos = duracaoSegundo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCompositor() {
		return compositor;
	}
	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}
	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}
	public void setDuracaoSegundos(int duracaoSegundos) {
		this.duracaoSegundos = duracaoSegundos;
	}
}
