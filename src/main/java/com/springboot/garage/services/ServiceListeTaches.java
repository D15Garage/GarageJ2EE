package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.TacheDAO;
import com.springboot.garage.model.Tache;

@Service
public class ServiceListeTaches implements IServiceListeTaches{

	@Autowired
	TacheDAO tacheDao;
	
	@Override
	public List<Tache> afficherTaches() {
		// TODO Auto-generated method stub
		return tacheDao.findAll();
	}

	@Override
	public Tache trouverTache(Integer idTache) {
		// TODO Auto-generated method stub
		List<Tache> taches = tacheDao.findAll();
		for (Tache t : taches) {
			if (t.getId()==idTache) {
				return t;
			}
		}
		return null;
	}

	@Override
	public void ajouterTache(Tache tache) {
		// TODO Auto-generated method stub
		tacheDao.save(tache);
	}

	@Override
	public void modifierTache(Tache tache) {
		// TODO Auto-generated method stub
		tacheDao.save(tache);
	}

	@Override
	public void supprimerTache(Tache tache) {
		// TODO Auto-generated method stub
		tacheDao.delete(tache);
	}

}
