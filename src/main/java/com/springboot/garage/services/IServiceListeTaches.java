package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Tache;

public interface IServiceListeTaches {
	
	List<Tache> afficherTaches();
	Tache trouverTache(Integer tacheModId);
	void ajouterTache(Tache tache);
	void modifierTache(Tache tache);
	void supprimerTache(Tache tache);

}
