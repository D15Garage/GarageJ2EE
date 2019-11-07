package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.springboot.garage.enums.EtatDevis;

@Entity
@Table
public class Devis {

	@Id
	@Column(name="iddevis")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	String reference;

	Date dateDeCreation;
	Date dateDeCloture;
	EtatDevis etat;
	String description;
	Double quantite;
	
	@ManyToOne
	@JoinColumn(name = "employe_idemploye")
	Employe employe;
	
	@ManyToOne
	@JoinColumn(name = "client_idclient")
	Client client;

	
	@ManyToOne
	@JoinColumn(name = "vehicules_idvehicules")
	Vehicule vehicule;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public Date getDateDeCloture() {
		return dateDeCloture;
	}
	public void setDateDeCloture(Date dateDeCloture) {
		this.dateDeCloture = dateDeCloture;
	}
	public EtatDevis getEtat() {
		return etat;
	}
	public void setEtat(EtatDevis etat) {
		this.etat = etat;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Double getQuantite() {
		return quantite;
	}
	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}
	
}
