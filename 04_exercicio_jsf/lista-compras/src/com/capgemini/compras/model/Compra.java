package com.capgemini.compras.model;

import java.math.BigDecimal;

public class Compra {
	
	private Integer id;
	private String produto;
	private String prioridadeCompra;
	private BigDecimal preco;
	
	// CONSTRUTORES
	public Compra() {}
	
	public Compra(Integer id, String produto, String prioridadeCompra, BigDecimal preco) {
		this.id = id;
		this.produto = produto;
		this.prioridadeCompra = prioridadeCompra;
		this.preco = preco;
	}
	
	// GETS E SETS
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public String getPrioridadeCompra() {
		return prioridadeCompra;
	}
	
	public void setPrioridadeCompra(String prioridadeCompra) {
		this.prioridadeCompra = prioridadeCompra;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", produto=" + produto + ", prioridadeCompra=" + prioridadeCompra + ", preco="
				+ preco + "]";
	}
	
}

