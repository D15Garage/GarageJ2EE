package com.springboot.garage.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.springboot.garage.enums.Civilite;

@Entity
@Table
public class Client {

	@Id
	@Column(name="idclient")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	Civilite civilite;
	String nom;
	String prenom;
	String adresse;
	String codePostal;
	String ville;
	String telephone;
	String mobile;
	
	Employe employee;
	List<Devis> devis;

	List<FicheEntretien> fiches;
	List<FactureEntretien> factures;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Employe getEmployee() {
		return employee;
	}
	public void setEmployee(Employe employee) {
		this.employee = employee;
	}
	public List<FicheEntretien> getFiches() {
		return fiches;
	}
	public void setFiches(List<FicheEntretien> fiches) {
		this.fiches = fiches;
	}
	public List<Devis> getDevis() {
		return devis;
	}
	public void setDevis(List<Devis> devis) {
		this.devis = devis;
	}
	public List<FactureEntretien> getFactures() {
		return factures;
	}
	public void setFactures(List<FactureEntretien> factures) {
		this.factures = factures;
	}
	
}
