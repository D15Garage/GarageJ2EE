package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Vehicule;

public interface IServiceListeVehicules {

	List<Vehicule> afficherVehicules();
	Vehicule trouverVehicule(Integer idVehicule);
	void ajouterVehicule(Vehicule vehicule);
	void modifierVehicule(Vehicule vehicule);
}
