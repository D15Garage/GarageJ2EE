package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.CommandeAchatVehicule;

public interface IServiceListeCommandeAchatVehicule {
	
	List<CommandeAchatVehicule> afficherCommandes();
	CommandeAchatVehicule trouverCommande(Integer idCommande);
	void ajouterCommande(CommandeAchatVehicule commande);
	void modifierCommande(CommandeAchatVehicule commande);
	
}
