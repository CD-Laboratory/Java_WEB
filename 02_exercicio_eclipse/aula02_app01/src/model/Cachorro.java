package model;

public class Cachorro {
	private String raca;
	private String nome;
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Cachorro [raca=" + raca + ", nome=" + nome + "]";
	}
	
	
}
