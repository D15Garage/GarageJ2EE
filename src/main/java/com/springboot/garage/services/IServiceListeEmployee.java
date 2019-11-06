package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Employe;

public interface IServiceListeEmployee {

	List<Employe> afficherEmployees();
	Employe trouverEmployee(Long idEmployee);
	void ajouterEmployee(Employe employee);
	void modifierEmployee(Employe employee);
}
