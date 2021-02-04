package com.capgemini.casamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.casamento.model.Convidado;

/* Esta interface serve para extender a classe jpa e pegar todos os metodos
 * que a acompanha */
public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
	
}
