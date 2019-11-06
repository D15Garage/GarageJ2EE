package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.VehiculeDAO;
import com.springboot.garage.model.Vehicule;

@Service
public class ServiceListeVehicules implements IServiceListeVehicules {

	@Autowired
	VehiculeDAO vehiculeDAO;

	@Override
	public List<Vehicule> afficherVehicules() {
		return vehiculeDAO.findAll();
	}

	@Override
	public Vehicule trouverVehicule(Integer idVehicule) {
		List<Vehicule> vehicules = vehiculeDAO.findAll();
		for (Vehicule v : vehicules) {
			if (v.getId() == idVehicule) {
				return v;
			}
		}
		return null;
	}

	@Override
	public void ajouterVehicule(Vehicule vehicule) {
		vehiculeDAO.save(vehicule);
	}

	@Override
	public void modifierVehicule(Vehicule vehicule) {
		vehiculeDAO.save(vehicule);
	}
}
