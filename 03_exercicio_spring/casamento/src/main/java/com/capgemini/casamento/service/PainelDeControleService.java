package com.capgemini.casamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.casamento.model.Convidado;
import com.capgemini.casamento.repository.ConvidadoRepository;

@Service
public class PainelDeControleService {
	
	@Autowired
	ConvidadoRepository convidadoRepository;
	
	public List<Convidado> recuperarTodosConvidados(){
		List<Convidado> convidados = convidadoRepository.findAll();	
		//imagine um codigo complexo aqui para retornar a lista de convidados
		return convidados;
	}
}
