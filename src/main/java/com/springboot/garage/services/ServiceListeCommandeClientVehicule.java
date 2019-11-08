package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.garage.dao.CommandeClientVehiculeDAO;
import com.springboot.garage.model.CommandeClientVehicule;

public class ServiceListeCommandeClientVehicule implements IServiceListeCommandeClientVehicule {

	
	@Autowired
	CommandeClientVehiculeDAO commandeDAO;
	
	@Override
	public List<CommandeClientVehicule> afficherCommandes() {
		// TODO Auto-generated method stub
		return commandeDAO.findAll();
	}

	@Override
	public CommandeClientVehicule trouverCommande(Integer idCommande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterCommande(CommandeClientVehicule commande) {
		// TODO Auto-generated method stub
		commandeDAO.save(commande);
	}

	@Override
	public void modifierCommande(CommandeClientVehicule commande) {
		// TODO Auto-generated method stub
		commandeDAO.save(commande);
	}

}
