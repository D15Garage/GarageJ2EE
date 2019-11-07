package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.FactureEntretienDAO;
import com.springboot.garage.model.FactureEntretien;

@Service
public class ServiceListeFactureEntretien implements IServiceListeFactureEntretien {

	@Autowired
	FactureEntretienDAO factureEntretienDAO;

	@Override
	public List<FactureEntretien> afficherfactures() {
		// TODO Auto-generated method stub
		return factureEntretienDAO.findAll();
	}

	@Override
	public FactureEntretien trouverFacture(Integer idFacture) {
		// TODO Auto-generated method stub
		List<FactureEntretien> factures = factureEntretienDAO.findAll();
		for(FactureEntretien f : factures) {
			if (f.getId() == idFacture) {
				return f;
			}
		}
		return null;
	}

	@Override
	public void ajouterFacture(FactureEntretien facture) {
		// TODO Auto-generated method stub
		factureEntretienDAO.save(facture);
	}

	@Override
	public void modifierFacture(FactureEntretien facture) {
		// TODO Auto-generated method stub
		factureEntretienDAO.save(facture);
	}
}