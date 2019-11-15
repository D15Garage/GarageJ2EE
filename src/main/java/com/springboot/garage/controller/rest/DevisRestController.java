package com.springboot.garage.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.garage.model.Devis;
import com.springboot.garage.services.IServiceListeDevis;

@RestController
@CrossOrigin
public class DevisRestController {

	@Autowired
	IServiceListeDevis devisService;
	
	@GetMapping(value = "/rest/Devis")
	public List<Devis> devis() {
		return devisService.afficherDevis();
	}
}
