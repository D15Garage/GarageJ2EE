package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.FactureEntretien;

public interface IServiceListeFactureEntretien {
	
	List<FactureEntretien> afficherfactures();
	FactureEntretien trouverFacture(Integer idFacture);
	void ajouterFacture(FactureEntretien facture);
	void modifierFacture(FactureEntretien facture);

}
