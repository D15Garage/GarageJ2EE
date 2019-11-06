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
public class FactureVehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	String reference;
	Date dateDeFacturation;
	
	@OneToOne
	@JoinColumn(name = "devis_iddevis")
	Devis devis;
	
	
	
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
	public Devis getDevis() {
		return devis;
	}
	public void setDevis(Devis devis) {
		this.devis = devis;
	}
	
}
