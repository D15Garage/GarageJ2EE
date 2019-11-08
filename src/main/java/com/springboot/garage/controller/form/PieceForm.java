package com.springboot.garage.controller.form;

import javax.validation.constraints.NotNull;

public class PieceForm {

	@NotNull
	String quantite;
	
	@NotNull
	String prixUnitaireHt;
	
	@NotNull
	String description;
	
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
