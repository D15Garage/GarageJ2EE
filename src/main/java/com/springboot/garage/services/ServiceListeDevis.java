package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.DevisDAO;
import com.springboot.garage.model.Devis;

@Service
public class ServiceListeDevis implements IServiceListeDevis {

	@Autowired
	DevisDAO devisDAO;

	@Override
	public List<Devis> afficherDevis() {
		return devisDAO.findAll();
	}

	@Override
	public Devis trouverDevis(Integer idDevis) {
		List<Devis> listeDevis = devisDAO.findAll();
		for (Devis d : listeDevis) {
			if (d.getId() == idDevis) {
				return d;
			}
		}
		return null;
	}

	@Override
	public void ajouterDevis(Devis devis) {
		devisDAO.save(devis);
	}

	@Override
	public void modifierDevis(Devis devis) {
		devisDAO.save(devis);
	}
	
}
