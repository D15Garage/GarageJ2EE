package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.springboot.garage.enums.EtatCommande;

@Entity
@Table(name="commande_pieces")
public class CommandeAchatPiece {

	@Id
	@Column(name="idcommande_pieces")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('Valide', 'Annule', 'En_attente')", name = "etat")
	EtatCommande etat;
	
	Date dateCreation;
	Date dateCloture;
	
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
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateCloture() {
		return dateCloture;
	}
	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
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
