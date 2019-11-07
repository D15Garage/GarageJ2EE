package com.springboot.garage.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.springboot.garage.enums.Entretien;
import com.springboot.garage.enums.EtatTache;
import com.springboot.garage.enums.Priorite;

@Entity
@Table
public class Tache {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	Entretien entretien;
	String description;
	EtatTache etat = EtatTache.En_Cours;
	Priorite priorite = Priorite.Normal;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pieces_idpieces")
	Piece piece;
	
	int quantitePiece;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Entretien getEntretien() {
		return entretien;
	}
	public void setEntretien(Entretien entretien) {
		this.entretien = entretien;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EtatTache getEtat() {
		return etat;
	}
	public void setEtat(EtatTache etat) {
		this.etat = etat;
	}
	public Priorite getPriorite() {
		return priorite;
	}
	public void setPriority(Priorite priorite) {
		this.priorite = priorite;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public int getQuantitePiece() {
		return quantitePiece;
	}
	public void setQuantitePiece(int quantitePiece) {
		this.quantitePiece = quantitePiece;
	}
}
