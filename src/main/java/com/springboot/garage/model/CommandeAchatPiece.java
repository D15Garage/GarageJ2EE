package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.springboot.garage.enums.EtatCommande;

@Entity
@Table(name="commande_piece")
public class CommandeAchatPiece {

	@Id
	@Column(name="idcommande_pieces")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	EtatCommande etat;
	String reference;
	Date dateDeCreation;
	Date dateDeCloture;
	
	@ManyToOne
	@JoinColumn(name="pieces_idpieces")
	Piece piece;
	
	Integer quantite;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public EtatCommande getEtat() {
		return etat;
	}
	public void setEtat(EtatCommande etat) {
		this.etat = etat;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public Date getDateDeCloture() {
		return dateDeCloture;
	}
	public void setDateDeCloture(Date dateDeCloture) {
		this.dateDeCloture = dateDeCloture;
	}
	public Piece getPiece() {
		return piece;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
}
