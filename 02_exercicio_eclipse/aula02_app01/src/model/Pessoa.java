package model;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Cachorro cachorro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public Cachorro getCachorro() {
		return cachorro;
	}
	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}
	
}
