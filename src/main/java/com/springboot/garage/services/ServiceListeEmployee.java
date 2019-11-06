package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.EmployeeDAO;
import com.springboot.garage.model.Employe;

@Service
public class ServiceListeEmployee implements IServiceListeEmployee{

	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	public List<Employe> afficherEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employe trouverEmployee(Long idEmployee) {
		List<Employe> employees = employeeDao.findAll();
		for (Employe e : employees) {
			if (e.getId() == idEmployee) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void ajouterEmployee(Employe employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

	@Override
	public void modifierEmployee(Employe employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

}
