package com.springboot.garage.controller.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.springboot.garage.enums.Priorite;

public class TacheForm {

	@NotNull
	String dateDeCreation;
	
	@NotNull
	@Pattern(regexp = "Vidange|Peinture|Réparation|Nettoyage")
	String entretien;
	
	@NotNull
	String vehicule;
	
	@NotNull
	String details;
	
	@Pattern(regexp = "Non prioritaire|Normal|Urgent|Très Urgent")
	String priorite;	
	
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
}
