package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.EmployeeDAO;
import com.springboot.garage.model.Employee;

@Service
public class ServiceListeEmployee implements IServiceListeEmployee{

	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	public List<Employee> afficherEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee trouverEmployee(Long idEmployee) {
		// TODO Auto-generated method stub
		List<Employee> employees = employeeDao.findAll();
		for (Employee e : employees) {
			if (e.getId() == idEmployee) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void ajouterEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

	@Override
	public void modifierEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

	@Override
	public void supprimerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.delete(employee);
	}
}
