package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Employe;

public interface IServiceListeEmploye {

	List<Employe> afficherEmployes();
	Employe trouverEmploye(Integer idEmploye);
	void ajouterEmploye(Employe employe);
	void modifierEmploye(Employe employe);
}
