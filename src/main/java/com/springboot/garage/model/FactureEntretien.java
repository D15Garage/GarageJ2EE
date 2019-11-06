package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class FactureEntretien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	String reference;
	Date dateDeFacturation;
	double prix;
	
	@OneToOne
	@JoinColumn(name = "fiche_entretiens_idfiche_entretiens")
	FicheEntretien fiche;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Date getDateDeFacturation() {
		return dateDeFacturation;
	}
	public void setDateDeFacturation(Date dateDeFacturation) {
		this.dateDeFacturation = dateDeFacturation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public FicheEntretien getFiche() {
		return fiche;
	}
	public void setFiche(FicheEntretien fiche) {
		this.fiche = fiche;
	}
}
