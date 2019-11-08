package com.springboot.garage.controller.form;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class EmployeForm {
	
	@Pattern(regexp = "Mr|Mme")
	String civilite;
	
	@NotNull
	String nom;
	
	@NotNull
	String prenom;
	
	@NotNull
	@Size(min=6)
	String motDePasse;
	
	@NotNull
	List<String> roles;
	
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}	
}
