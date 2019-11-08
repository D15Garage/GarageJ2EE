package com.springboot.garage.controller.form;

import javax.validation.constraints.NotNull;

public class VehiculeForm {
	@NotNull
	String marque;
	
	@NotNull
	String modele;
	
	@NotNull
	String annee;
	
	String couleur;
	
	@NotNull
	String quantite;
	
	@NotNull
	String prixUnitaireHt;
}
