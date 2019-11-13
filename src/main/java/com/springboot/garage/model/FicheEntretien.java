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
import javax.persistence.Table;

import com.springboot.garage.enums.EtatFicheEntretien;
import com.springboot.garage.enums.Priorite;

@Entity
@Table(name="fiche_entretiens")
public class FicheEntretien {

	@Id
	@Column(name="idfiche_entretiens")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	Date dateCreation;
	Date dateCloture;
	String description;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('Refusee', 'En_attente', 'En_cours', 'Cloturee')", name = "etat")
	EtatFicheEntretien etat = EtatFicheEntretien.En_Attente;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('Non_prioritaire', 'Normal', 'Urgent', 'Tres_urgent')", name = "niveau_de_priorite")
	Priorite priorite = Priorite.Normal;

	Double nombreHeure;
	Double tauxHoraire;
	
	@ManyToOne
	@JoinColumn(name = "client_idclient")
	Client client;
	

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
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateCloture() {
		return dateCloture;
	}
	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EtatFicheEntretien getEtat() {
		return etat;
	}
	public void setEtat(EtatFicheEntretien etat) {
		this.etat = etat;
	}
	public Priorite getPriorite() {
		return priorite;
	}
	public void setPriorite(Priorite priorite) {
		this.priorite = priorite;
	}
	public Double getNombreHeure() {
		return nombreHeure;
	}
	public void setNombreHeure(Double nombreHeure) {
		this.nombreHeure = nombreHeure;
	}
	public Double getTauxHoraire() {
		return tauxHoraire;
	}
	public void setTauxHoraire(Double tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}
	
}
