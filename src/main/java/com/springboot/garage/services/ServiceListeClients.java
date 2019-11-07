package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.ClientDAO;
import com.springboot.garage.model.Client;

@Service
public class ServiceListeClients implements IServiceListeClients {

	@Autowired
	ClientDAO clientDao;
	
	@Override
	public List<Client> afficherClients() {
		return clientDao.findAll();
	}

	@Override
	public Client trouverClient(Integer idClient) {
		List<Client> clients = clientDao.findAll();
		for (Client c : clients) {
			if (c.getId() == idClient) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void ajouterClient(Client client) {
		clientDao.save(client);
	}

	@Override
	public void modifierClient(Client client) {
		clientDao.save(client);
	}
}
