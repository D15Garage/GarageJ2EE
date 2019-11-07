package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.EmployeDAO;
import com.springboot.garage.model.Employe;

@Service
public class ServiceListeEmploye implements IServiceListeEmploye{

	@Autowired
	EmployeDAO employeDao;
	
	@Override
	public List<Employe> afficherEmployes() {
		return employeDao.findAll();
	}

	@Override
	public Employe trouverEmploye(Integer idEmploye) {
		List<Employe> employes = employeDao.findAll();
		for (Employe e : employes) {
			if (e.getId() == idEmploye) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void ajouterEmploye(Employe employe) {
		// TODO Auto-generated method stub
		employeDao.save(employe);
	}

	@Override
	public void modifierEmploye(Employe employe) {
		// TODO Auto-generated method stub
		employeDao.save(employe);
	}

}
