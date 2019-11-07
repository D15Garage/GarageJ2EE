package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Devis;

public interface IServiceListeDevis{

	List<Devis> afficherDevis();
	Devis trouverDevis(Integer idDevis);
	void ajouterDevis(Devis devis);
	void modifierDevis(Devis devis);
}
