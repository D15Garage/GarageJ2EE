package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Client;

public interface IServiceListeClients {
	
	List<Client> afficherClients();
	Client trouverClient(Integer id);
	void ajouterClient(Client client);
	void modifierClient(Client client);
	
}
