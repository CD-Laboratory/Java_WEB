package com.capgemini.casamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.casamento.service.PainelDeControleService;

@Controller
@RequestMapping("painel-de-controle")
public class PainelDeControleController {
	
	/* aqui eu chamo novamente o repository que me da acesso ao banco de convidados 
	 * isso se chama inversao de dependencia, ou seja, o spring (framework) da new e 
	 * o inicia  repositorio para mim, gerenciando a criacao de objetos
	 * */
	@Autowired
	PainelDeControleService service;

	@GetMapping("home")
	public ModelAndView home() {
		/* aqui eu defino que meu model ira abrir a pagina home*/
		ModelAndView modelAndView = new ModelAndView("painel-de-controle/home");
		
		/* aqui eu dou um nome para a lista,neste caso convidados, que se conecta com o nome
		 * da lista que a pagina home espera
		 * assim, eu mando para a pagina home, dentro do meu model, uma lista de convidados*/
		modelAndView.addObject("convidados", service.recuperarTodosConvidados());
		
		return modelAndView;
	}
}
