package com.springboot.garage.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
        .withUser("admin")
        .password("admin")
        .roles("ADMIN")
        .and()
        .withUser("commercial")
        .password("commercial")
        .roles("COMMERCIAL")
		.and()
        .withUser("magasinier")
        .password("magasinier")
        .roles("MAGASINIER")
        .and()
        .withUser("chefatelier")
        .password("chefatelier")
        .roles("CHEFATELIER")
        .and()
        .withUser("mecanicien")
        .password("mecanicien")
        .roles("MECANICIEN");
	}

	@Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		super.configure(http);
	}

	
}
