package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.CommandeClientVehicule;

public interface IServiceListeCommandeClientVehicule {
	
	List<CommandeClientVehicule> afficherCommandes();
	CommandeClientVehicule trouverCommande(Integer idCommande);
	void ajouterCommande(CommandeClientVehicule commande);
	void modifierCommande(CommandeClientVehicule commande);
	
}
