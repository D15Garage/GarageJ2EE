package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.springboot.garage.enums.EtatCommande;

@Entity
@Table(name="commande_vehicules")
public class CommandeClientVehicule {

	@Id
	@Column(name="idcommande_vehicules")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('Valide', 'Annule', 'En attente')", name = "etat")
	EtatCommande etat;
	Date dateCreation;
	Date dateCloture;

	Integer quantite;
	
	@OneToOne
	@JoinColumn(name = "devis_iddevis")
	Devis devis;
	
	@ManyToOne
	@JoinColumn(name = "vehicules_idvehicules")
	Vehicule vehicule;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public EtatCommande getEtat() {
		return etat;
	}
	public void setEtat(EtatCommande etat) {
		this.etat = etat;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateDeCloture() {
		return dateCloture;
	}
	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}
	public Devis getDevis() {
		return devis;
	}
	public void setDevis(Devis devis) {
		this.devis = devis;
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
