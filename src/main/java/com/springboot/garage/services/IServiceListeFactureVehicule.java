package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.FactureVehicule;

public interface IServiceListeFactureVehicule {
	
	
	List<FactureVehicule> afficherFactures();
	FactureVehicule trouverFacture(Integer idFacture);
	void ajouterFacture(FactureVehicule facture);
	void modifierFacture(FactureVehicule facture);
	
}
