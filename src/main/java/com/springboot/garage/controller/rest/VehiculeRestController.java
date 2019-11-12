package com.springboot.garage.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.garage.model.Vehicule;
import com.springboot.garage.services.IServiceListeVehicules;

@RestController
@CrossOrigin
public class VehiculeRestController {

	@Autowired
	IServiceListeVehicules vehiculesService;
	
	@GetMapping(value = "/rest/Vehicules")
	public List<Vehicule> vehicules() {
		return vehiculesService.afficherVehicules();
	}
}
