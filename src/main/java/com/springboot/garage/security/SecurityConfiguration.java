package com.springboot.garage.security;

import org.aspectj.weaver.ast.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication()
		.withUser("admin")
		.password("admin")
		.roles("administrateur")
		.and()
		.withUser("commercial")
		.password("commercial")
		.roles("commercial")
		.and()
		.withUser("magasinier")
		.password("magasinier")
		.roles("magasinier")
		.and()
		.withUser("chefatelier")
		.password("chefatelier")
		.roles("chefatelier")
		.and()
		.withUser("mecanicien")
		.password("mecanicien")
		.roles("mecanicien");

		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
//		http.authorizeRequests()
//		.antMatchers("/admin").hasRole("administrateur")
//		.antMatchers("/admin").hasRole("magasinier")
//		.antMatchers("/admin").hasRole("mecanicien")
//		.antMatchers("/admin").hasRole("commercial")
//		.antMatchers("/admin").hasRole("'chefatelier'")
//		.antMatchers("/user").hasAnyRole("ADMIN", "USER")
//		.antMatchers("/").permitAll()
//		.and().formLogin();

		http.authorizeRequests()
		.antMatchers("/Pieces").hasAnyRole("magasinier", "chefatelier")
		.antMatchers("/Pieces/**").hasAnyRole("magasinier", "chefatelier")
		.antMatchers("/rest/**").permitAll()
		.and().formLogin();
		http.cors().and().csrf().disable().authorizeRequests().antMatchers("/rest/**").permitAll();

	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
