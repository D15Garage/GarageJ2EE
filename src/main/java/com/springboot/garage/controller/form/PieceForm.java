package com.springboot.garage.controller.form;

import javax.validation.constraints.NotNull;

public class PieceForm {
	
	private Integer id;
	
	@NotNull
	String reference;
	
	@NotNull
	String quantite;
	
	@NotNull
	String prixUnitaireHt;
	
	@NotNull
	String description;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
