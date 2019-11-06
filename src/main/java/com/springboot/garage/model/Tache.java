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
import com.springboot.garage.enums.Priority;

@Entity
@Table
public class Tache {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	Entretien entretien;
	String description;
	EtatTache etat = EtatTache.En_Cours;
	Priority priority = Priority.Normal;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pieces_idpieces")
	Piece piece;
	
	int quantityPiece;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public int getQuantityPiece() {
		return quantityPiece;
	}
	public void setQuantityPiece(int quantityPiece) {
		this.quantityPiece = quantityPiece;
	}
}
