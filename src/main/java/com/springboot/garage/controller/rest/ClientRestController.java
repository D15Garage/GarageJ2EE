package com.springboot.garage.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.garage.model.Client;
import com.springboot.garage.services.IServiceListeClients;

@RestController
@CrossOrigin
public class ClientRestController {

	@Autowired
	IServiceListeClients clientService;
	
	@GetMapping(name = "/rest/Clients")
	public List<Client> clients() {
		return clientService.afficherClients();
	}

	@PostMapping(value = "/rest/Clients")
	public void addClient(@RequestBody Client client) {
		clientService.ajouterClient(client);
	}
	
	@PutMapping(value = "/rest/Clients")
	public void modClient(@RequestBody Client client) {
		clientService.modifierClient(client);
	}
}
