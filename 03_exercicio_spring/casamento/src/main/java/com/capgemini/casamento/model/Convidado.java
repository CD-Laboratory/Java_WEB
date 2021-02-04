package com.capgemini.casamento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

/* em java eu posso Serializar objetos, que significa transformar eles em biarios
 * caso eu queira desetializar, tambem e possivel
 *  
 *  quando se usa a marcacao entity, quer diser que eu posso trafegar a minha classe/objetos,
 *  de um lugar para  outro ou salvar ele no "disco" para recuperar depois. Enfim, com a marcacao entity
 *  e necessario implementar serializable
 *  
 *  para cada entidade eu tenho uma tabela no banco de dados, ou seja, eu teria uma tabela convidados
 *  para guardar informacoes dos convidados
 *  
 *  a entity cria uma tabela mapeando os datatypes do java (int, boolean...) com os do mysql, permitindo
 *  que o spring entenda que o convidado é uma entidade que deve ser persistida, assim, ele cria
 *  no banco de dados uma tabela que espelha a classe java
 *  
 *  as jpas permitem trabalharmos com objetos java e converte tudo em para linhas no banco de dados
 *  
*/

@Entity
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/* aqui informa que este campo seta autoincrementado
	 * e que ele sera a chave primatia da tabela
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/*
	 * este campo insere sim - Y ou nao - N na tabela, dependendo do retorno do objeto boolean
	 */
	@Type(type="yes_no")
	private boolean presencaConfirmada;
	
	/* trata a nulidade dos campos, impedindo que eles venham nulos */
	@Column(nullable = false)
	private String nome;
	private String email;
	private String telefone;
	private byte quantidadeAdultos;
	private byte quantidadeCriancas;
	private String mensagem;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isPresencaConfirmada() {
		return presencaConfirmada;
	}
	public void setPresencaConfirmada(boolean presencaConfirmada) {
		this.presencaConfirmada = presencaConfirmada;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public byte getQuantidadeAdultos() {
		return quantidadeAdultos;
	}
	public void setQuantidadeAdultos(byte quantidadeAdultos) {
		this.quantidadeAdultos = quantidadeAdultos;
	}
	public byte getQuantidadeCriancas() {
		return quantidadeCriancas;
	}
	public void setQuantidadeCriancas(byte quantidadeCriancas) {
		this.quantidadeCriancas = quantidadeCriancas;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String toString() {
		return "Convidado [ id=" + id + ", presencaConfirmada=" + presencaConfirmada + ", nome=" + nome + ", email="
				        + email + ", telefone=" + telefone + ", quantidadeAdultos=" + quantidadeAdultos
				        + ", quantidadeCriancas=" + quantidadeCriancas + ", mensagem=" + mensagem + " ]";
	}
}
