package com.capgemini.casamento.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/* o configuration informa que e uma classe de configuracao e o spring ira usar ela para configurar
 * o enable web security e usado para habilitar a seguranca na confirguracao
 * alem disso temos que exterder a clase WebSecurityConfigurerAdapter para sobrescrever alguns metodos dela
 * */
@Configuration
@EnableWebSecurity
public class PainelDeControleSecurityConfig  extends WebSecurityConfigurerAdapter{
	
	/* aqui ao sobrescrever a classe configure, estamos setando o usuario e a senha 
	 * manualmente
	 * */
	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder
		  /* aqui o usuario e setado na memoria*/
			.inMemoryAuthentication()
			     /* aqui eu seto a mao o usuario da pagina */
				.withUser("jessica")
				
				/* aqui a senha e codificado, a tornando segura */
				.password(new BCryptPasswordEncoder().encode("1234567"))
				
				/* aqui eu defino o usuario como administrador da pagina*/
				.roles("ADMIN")
			.and()
				.passwordEncoder(new BCryptPasswordEncoder());
	}
	
	/* aqui e informado que tudo for html, webjar, style ...  deve ser ignorado
	 * para que nao seja barrado na pagina */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**.html", "/webjars/**", "/styles/**", "/img/**");
	}
	
	/* aqui informa a autorizacao de cada pagina, ou seja, para qual pagina precisa 
	 * usar o login e senha*/
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()
			     /* aqui ele permite qua a pagina listar casamento seja acessada sem login e senha*/
			    .antMatchers("listar-casamento/**").permitAll()
			    
			     /* aqui ele informa que a pagina painel de controle precisa de login e senha*/
			    .antMatchers("painel-de-controle/**").hasRole("ADMIN")
			    .anyRequest().authenticated()
		    .and()
		        /* aqui ele informa que a forma de autentificacao de ser em forma de login, 
		         * pagina do proprio spring que pode ser personalizada */
	        	.formLogin();
	}

}
