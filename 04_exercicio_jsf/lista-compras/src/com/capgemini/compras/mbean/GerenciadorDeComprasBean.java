package com.capgemini.compras.mbean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.capgemini.compras.model.Compra;

@ManagedBean
@SessionScoped
public class GerenciadorDeComprasBean {
	
	private Compra compra;
	private List<Compra> listaDeCompra;
	private List<SelectItem> prioridades;
	private static int contador;
	
	// CONTRUTORES
	public GerenciadorDeComprasBean() {
		
		compra = new Compra(null, "", "Média", null);	
		listaDeCompra = new ArrayList<>();
		
		listaDeCompra.add(new Compra(1, "Chocolate", "Baixa", new BigDecimal("10.0")));
		listaDeCompra.add(new Compra(2, "Batata", "Alta", new BigDecimal("15.0")));
		listaDeCompra.add(new Compra(3, "Mandioca", "Média", new BigDecimal("12.0")));
		
		contador = listaDeCompra.size();
	}
	
	// GETS E SETS
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	public List<Compra> getListaDeCompra(){
		return listaDeCompra;
	}
	public void setListaDeCompra(List<Compra> listaDeCompra) {
		this.listaDeCompra = listaDeCompra;
	}
	
	public List<SelectItem> getPrioridades(){
		prioridades = new ArrayList<>();
		
		prioridades.add(new SelectItem("baixa", "Baixa"));
		prioridades.add(new SelectItem("media", "Média"));
		prioridades.add(new SelectItem("alta", "Alta"));
		
		return prioridades;
	}
	
	// METODOS - LOGICA DO CRUD
	
	public void inicializarCompra() {
		compra = new Compra(null, "", "Média", null);
	}
	
    public void salvarCompra() {
		
		if(compra.getId() == null) {
		   compra.setId(++contador);
		   listaDeCompra.add(compra);
		} 
		
		inicializarCompra();
		addMensagem("Compra Salva com sucesso !");
	}
    
	public void atualizarCompra(Compra compra) {
		this.compra = compra;
	}
    
	public void excluirCompra(Compra compra) {
		listaDeCompra.remove(compra);
		addMensagem("Tarefa excluída com sucesso !");
	}
	
	private void addMensagem(String msg) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);		
		FacesContext.getCurrentInstance().addMessage(null, message);;
	}
}
