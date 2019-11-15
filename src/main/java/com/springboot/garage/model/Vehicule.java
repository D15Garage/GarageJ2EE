package com.springboot.garage.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicules")
public class Vehicule {

	@Id
	@Column(name="idvehicules")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	Date dateSaisieStock;
	String reference;
	String marque;
	String modele;
	String annee;
	String couleur;
	Integer quantite;
	Double prixUnitaireHt;
	
	public Date getDateSaisieStock() {
		return dateSaisieStock;
	}
	public void setDateSaisieStock(Date dateSaisieStock) {
		this.dateSaisieStock = dateSaisieStock;
	}
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
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
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
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Double getPrixUnitaireHt() {
		return prixUnitaireHt;
	}
	public void setPrixUnitaireHt(Double prixUnitaireHt) {
		this.prixUnitaireHt = prixUnitaireHt;
	}
	
}
