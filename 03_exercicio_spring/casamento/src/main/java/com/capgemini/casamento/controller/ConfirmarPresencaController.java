package com.capgemini.casamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.casamento.model.Convidado;
import com.capgemini.casamento.repository.ConvidadoRepository;

/*
 * estas anotacoes serve para importar configuracoes sem precisar do arquivo .xml
 * elas trabalham com meta dados
 * no caso da anotacao abaixo, o controller importa configuracoes de 
 * org.springframework.stereotype.Controller
 * 
 * o requestmapping esta servindo como um mapeamento global das classes
 * entao na url caso queira chamar alguma classe ficaria : http://localhost:8081/listar-casamento/confirmar-presenca
*/

@Controller
@RequestMapping("listar-casamento")
public class ConfirmarPresencaController {
	
	/* aqui o srping, atraves do autowired, vai implementar a classe Jpa que a interface
	 * ConvidadoRepository extends
	 * */
	@Autowired
	ConvidadoRepository convidadoRepository;
	
	/* este getmapping funciona que nem o servlet-mapping, ele e usado para mapeamento, 
	 * dentro da classe que tem a anotacao getMapping, a anotacao irá procurar uma pagina
	 * para retornar 
	*/
	@GetMapping("confirmar-presenca")
	public ModelAndView mostrarPaginaConfirmartPresenca() {
		
		ModelAndView modelAndView = new ModelAndView("confirmar-presenca");
		
		modelAndView.addObject(new Convidado());
		
		return modelAndView;
	}
	
	@PostMapping("presenca-confirmada")
	public String confirmarPresenca(Convidado convidado) {
		convidadoRepository.save(convidado);
		return "presenca-confirmada";
	}
}
