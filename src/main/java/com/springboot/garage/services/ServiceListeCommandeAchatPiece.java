package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.garage.dao.CommandeAchatPieceDAO;
import com.springboot.garage.model.CommandeAchatPiece;

public class ServiceListeCommandeAchatPiece implements IServiceListeCommandeAchatPiece {

	
	@Autowired
	CommandeAchatPieceDAO commandeDAO;
	
	@Override
	public List<CommandeAchatPiece> afficherCommandes() {
		// TODO Auto-generated method stub
		return commandeDAO.findAll();
	}

	@Override
	public CommandeAchatPiece trouverCommande(Long idCommande) {
		// TODO Auto-generated method stub
		List<CommandeAchatPiece> commandes = commandeDAO.findAll();
		for (CommandeAchatPiece c : commandes) {
			if (c.getId() == idCommande) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void ajouterCommande(CommandeAchatPiece commande) {
		// TODO Auto-generated method stub
		commandeDAO.save(commande);
	}

	@Override
	public void modifierCommande(CommandeAchatPiece commande) {
		// TODO Auto-generated method stub
		commandeDAO.save(commande);
	}

}
