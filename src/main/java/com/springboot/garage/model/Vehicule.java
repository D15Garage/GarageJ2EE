package com.springboot.garage.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vehicules")
public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	String reference;
	String marque;
	String modele;
	Integer annee;
	String couleur;
	Integer quantite;
	Double prixUnitaireHT;
	
	@OneToMany(mappedBy="vehicule")
	List<Devis> devis;
	
	@OneToMany(mappedBy="vehicule")
	List<CommandeAchatVehicule> commandes;
	
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
	public Integer getAnnee() {
		return annee;
	}
	public void setAnnee(Integer annee) {
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
	public Double getPrix() {
		return prixUnitaireHT;
	}
	public void setPrix(Double prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}
	
}
