package com.algaworks.festa.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class InMemorySecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
				.withUser("jessica")
				.password(new BCryptPasswordEncoder().encode("1234567"))
			    .roles("ADMIN")
			.and()
				.withUser("joao")
				.password(new BCryptPasswordEncoder().encode("123"))
				.roles("USER")
			.and()
				.withUser("alexandre")
				.password(new BCryptPasswordEncoder().encode("123"))
				.roles("USER")
			.and()
				.withUser("thiago")
				.password(new BCryptPasswordEncoder().encode("123"))
				.roles("USER")
 			.and()
 				.passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**.html", "/webjars/**", "/styles/**", "/img/**");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()		    
			    .antMatchers("templates/**").hasRole("ADMIN")
			    .antMatchers("templates/**").hasRole("USER")
			    .anyRequest().authenticated()
		    .and()
	        	.formLogin();
	}
}
