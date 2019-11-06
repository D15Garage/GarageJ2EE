package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.garage.dao.CommandeAchatVehiculeDAO;
import com.springboot.garage.model.CommandeAchatVehicule;

public class ServiceListeCommandeAchatVehicule implements IServiceListeCommandeAchatVehicule {

	
	@Autowired
	CommandeAchatVehiculeDAO commandeDAO;
	
	@Override
	public List<CommandeAchatVehicule> afficherCommandes() {
		// TODO Auto-generated method stub
		return commandeDAO.findAll();
	}

	@Override
	public CommandeAchatVehicule trouverCommande(Long idCommande) {
		// TODO Auto-generated method stub
		List<CommandeAchatVehicule> commandes = commandeDAO.findAll();
		for (CommandeAchatVehicule c : commandes) {
			//here
		}
		return null;
	}

	@Override
	public void ajouterCommande(CommandeAchatVehicule commande) {
		// TODO Auto-generated method stub
		commandeDAO.save(commande);
	}

	@Override
	public void modifierCommande(CommandeAchatVehicule commande) {
		// TODO Auto-generated method stub
		commandeDAO.save(commande);
	}

}
