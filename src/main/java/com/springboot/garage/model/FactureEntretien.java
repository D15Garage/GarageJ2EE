package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="facture_pieces")
public class FactureEntretien {

	@Id
	@Column(name="idfacture_pieces")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String numeroFacture;
	Date dateFacturation;
	Double total;
	Double tauxTVA;
	
	@OneToOne
	@JoinColumn(name = "idfiche_entretiens")
	FicheEntretien fiche;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroFacture() {
		return numeroFacture;
	}
	public void setNumeroFacture(String numeroFacture) {
		this.numeroFacture = numeroFacture;
	}
	public Date getDateFacturation() {
		return dateFacturation;
	}
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getTauxTVA() {
		return tauxTVA;
	}
	public void setTauxTVA(Double tauxTVA) {
		this.tauxTVA = tauxTVA;
	}
	public FicheEntretien getFiche() {
		return fiche;
	}
	public void setFiche(FicheEntretien fiche) {
		this.fiche = fiche;
	}
	
	
}
