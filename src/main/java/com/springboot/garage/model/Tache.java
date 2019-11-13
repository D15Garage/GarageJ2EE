package com.springboot.garage.model;

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

import com.springboot.garage.enums.Entretien;
import com.springboot.garage.enums.EtatTache;
import com.springboot.garage.enums.Priorite;

@Entity
@Table(name="taches")
public class Tache {

	@Id
	@Column(name="idtaches")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String description;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('Vidange', 'Peinture', 'Reparation', 'Nettoyage')", name = "type_entretien")
	Entretien typeEntretien;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('A realiser', 'En cours', 'Suspendue', 'Terminee')", name = "etat")
	EtatTache etat = EtatTache.A_realiser;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('Non prioritaire', 'Normal', 'Urgent', 'Tres urgent')", name = "niveau_de_priorite")
	Priorite priorite = Priorite.Normal;

	Integer quantitePieces;
	
	@ManyToOne
	@JoinColumn(name = "fiche_entretiens_idfiche_entretiens")
	FicheEntretien fiche;
	
	@ManyToOne
	@JoinColumn(name = "employe_idemploye")
	Employe employe;
	
	@ManyToOne
	@JoinColumn(name = "pieces_idpieces")	
	Piece piece;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Entretien getTypeEntretien() {
		return typeEntretien;
	}
	public void setTypeEntretien(Entretien typeEntretien) {
		this.typeEntretien = typeEntretien;
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
	public Integer getQuantitePieces() {
		return quantitePieces;
	}
	public void setQuantitePieces(Integer quantitePieces) {
		this.quantitePieces = quantitePieces;
	}
}
