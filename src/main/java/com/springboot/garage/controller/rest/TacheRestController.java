package com.springboot.garage.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.garage.model.Tache;
import com.springboot.garage.services.IServiceListeTaches;

@RestController
@CrossOrigin
public class TacheRestController {

	@Autowired
	IServiceListeTaches tachesService;
	
	@GetMapping(value = "/rest/Taches")
	public List<Tache> taches() {
		return tachesService.afficherTaches();
	}
}
