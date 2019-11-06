package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.garage.dao.FactureVehiculeDAO;
import com.springboot.garage.model.FactureVehicule;

public class ServiceListeFactureVehicule implements IServiceListeFactureVehicule {
	
	@Autowired
	FactureVehiculeDAO factureVehiculeDAO;

	@Override
	public List<FactureVehicule> afficherFactures() {
		// TODO Auto-generated method stub
		return factureVehiculeDAO.findAll();
	}

	@Override
	public FactureVehicule trouverFacture(Long idFacture) {
		// TODO Auto-generated method stub
		List<FactureVehicule> factures = factureVehiculeDAO.findAll();
		for (FactureVehicule f : factures) {
			if (f.getId() == idFacture) {
				return f;
			}
		}
		return null;
	}

	@Override
	public void ajouterFacture(FactureVehicule facture) {
		// TODO Auto-generated method stub
		factureVehiculeDAO.save(facture);
	}

	@Override
	public void modifierFacture(FactureVehicule facture) {
		// TODO Auto-generated method stub
		factureVehiculeDAO.save(facture);
	}
	
}
