package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Employe;

public interface IServiceListeEmployee {

<<<<<<< HEAD
	List<Employee> afficherEmployees();
	Employee trouverEmployee(Integer id);
	void ajouterEmployee(Employee employee);
	void modifierEmployee(Employee employee);
=======
	List<Employe> afficherEmployees();
	Employe trouverEmployee(Long idEmployee);
	void ajouterEmployee(Employe employee);
	void modifierEmployee(Employe employee);
>>>>>>> ede31582910761f9a48c7023af03b1abca078115
}
