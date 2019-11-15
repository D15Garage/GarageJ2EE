package com.springboot.garage.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.garage.model.FicheEntretien;
import com.springboot.garage.services.IServiceListeFiches;

@RestController
@CrossOrigin
public class FicheEntretienRestController {

	@Autowired
	IServiceListeFiches fichesService;
	
	@GetMapping(value = "/rest/Fiches")
	public List<FicheEntretien> fiches() {
		return fichesService.afficherFiches();
	}
}
