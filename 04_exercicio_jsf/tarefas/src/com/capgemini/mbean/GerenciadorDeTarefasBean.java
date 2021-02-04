package com.capgemini.mbean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.capgemini.model.Tarefa;

/* aqui eu defino que minha classe sera uma managed bean
 * e defino um dos escopos dele, no caso o session scoped
 * */

@ManagedBean
@SessionScoped
public class GerenciadorDeTarefasBean {

	private Tarefa tarefa;
	private List<Tarefa> tarefas;
	private static int contador;
	private List<SelectItem> prioridades;
	
	/* esta classe é gerenciada pelo JSF - ManageBean, entao que instancia
	 * ele dando new e o JSF
	 * */ 
	public GerenciadorDeTarefasBean() {
		tarefa = new Tarefa(null, "", "", "Média", new Date());
		
		tarefas = new ArrayList<>();
		
		//adicionando tarefas de teste
		tarefas.add(new Tarefa(1, "Titulo 1", "Descriao 1", "Baixa", new Date()));
		tarefas.add(new Tarefa(2, "Titulo 2", "Descriao 2", "Alta", new Date()));
		
		contador = tarefas.size();
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	public void novaTarefa() {
		tarefa = new Tarefa(null, "", "", "Média", new Date());
	}
		
	public void salvarTarefa() {
		
		if(tarefa.getId() == null) {
		   tarefa.setId(++contador);
			// salvo a tarefa na lista
			tarefas.add(tarefa);
		} 

		// limpo a varivel tarefa, para poder receber uma nova tarefa
		novaTarefa();
		
		// emito mensagem de sucesso
		addMensagem("Tarefa Salva !");
	}
	
	public void apagarTarefa(Tarefa tarefa) {
		tarefas.remove(tarefa);
		addMensagem("Tarefa apagada!");
	}
	
	public void editarTarefa(Tarefa tarefa) {
		//faz a tarefa que eu selecionei voltar aos campo de texto para eu alterar
		this.tarefa = tarefa;
	}

	private void addMensagem(String msg) {
		// mensagem informativa
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);		
		FacesContext.getCurrentInstance().addMessage(null, message);;
	}
	
	public List<SelectItem> getPrioridades(){
		
		prioridades = new ArrayList<>();
		
		/* aqui eu crio uma lista de prioridades onde:
		 * new SelectItem(id da lista , descricao que aparece para o usuario)
		 * */
        prioridades.add(new SelectItem("baixa", "Baixa"));
        prioridades.add(new SelectItem("media", "Média"));
        prioridades.add(new SelectItem("alta", "Alta"));
        
        return prioridades;
	}
}

