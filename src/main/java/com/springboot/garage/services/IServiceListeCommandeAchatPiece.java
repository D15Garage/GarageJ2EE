package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.CommandeAchatPiece;

public interface IServiceListeCommandeAchatPiece {

	List<CommandeAchatPiece> afficherCommandes();
	CommandeAchatPiece trouverCommande(Integer idCommande);
	void ajouterCommande(CommandeAchatPiece commande);
	void modifierCommande(CommandeAchatPiece commande);
	
}
