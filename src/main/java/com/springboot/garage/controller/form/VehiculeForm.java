package com.springboot.garage.controller.form;

import javax.validation.constraints.NotNull;

public class VehiculeForm {
	
	private Integer id;
	
	@NotNull
	String marque;
	
	@NotNull
	String reference;
	
	@NotNull
	String modele;
	
	@NotNull
	String annee;
	
	@NotNull
	String quantite;
	
	@NotNull
	String prixUnitaireHt;
	
	String couleur;
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Integer getId() {
		return id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getPrixUnitaireHt() {
		return prixUnitaireHt;
	}

	public void setPrixUnitaireHt(String prixUnitaireHt) {
		this.prixUnitaireHt = prixUnitaireHt;
	}
	
	
}
