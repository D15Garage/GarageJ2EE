package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
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
	
	Date dateCreation;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('Valide', 'Annule', 'En_attente')", name = "etat")
	EtatDevis etat;
	
	Integer quantite;
	
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
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public EtatDevis getEtat() {
		return etat;
	}
	public void setEtat(EtatDevis etat) {
		this.etat = etat;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	
}
