package com.springboot.garage.controller.form;

import com.springboot.garage.enums.Priorite;

public class TacheForm {

	String dateDeCreation;
	String entretien;
	String vehicule;
	String etat;
	String details;
	String priorite = Priorite.Normal.toString();
	String fiche;
	
	
	
	public String getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public String getEntretien() {
		return entretien;
	}
	public void setEntretien(String entretien) {
		this.entretien = entretien;
	}
	public String getVehicule() {
		return vehicule;
	}
	public void setVehicule(String vehicule) {
		this.vehicule = vehicule;
	}
	public String getEtat() {
		return etat;
	}
	public void setStatus(String status) {
		this.etat = status;
	}
	public String getPriorite() {
		return priorite;
	}
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getFiche() {
		return fiche;
	}
	public void setFiche(String fiche) {
		this.fiche = fiche;
	}
	
}
