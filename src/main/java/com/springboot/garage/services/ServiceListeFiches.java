package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.FicheEntretienDAO;
import com.springboot.garage.model.FicheEntretien;

@Service
public class ServiceListeFiches implements IServiceListeFiches {

	@Autowired
	FicheEntretienDAO ficheDAO;
	
	@Override
	public List<FicheEntretien> afficherFiches() {
		// TODO Auto-generated method stub
		return ficheDAO.findAll();
	}

	@Override
	public FicheEntretien trouverFiche(Integer idFiche) {
		// TODO Auto-generated method stub
		List<FicheEntretien> fiches = ficheDAO.findAll();
		for (FicheEntretien f : fiches) {
			if (f.getId() == idFiche) {
				return f;
			}
		}
		return null;
	}

	@Override
	public void ajouterFiche(FicheEntretien fiche) {
		// TODO Auto-generated method stub
		ficheDAO.save(fiche);
	}

	@Override
	public void modifierFiche(FicheEntretien fiche) {
		// TODO Auto-generated method stub
		ficheDAO.save(fiche);
	}

}
