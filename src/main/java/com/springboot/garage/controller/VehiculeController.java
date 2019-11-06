package com.springboot.garage.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.VehiculeForm;
import com.springboot.garage.services.IServiceListeVehicules;

@Controller
public class VehiculeController {

	@Autowired
	IServiceListeVehicules vehiculeService;
	
	@GetMapping(value = "/afficherVehicule")
	public String afficherVehicule(Model model) {
		model.addAttribute("listeVehicule", vehiculeService.afficherVehicules());
		return "afficherVehicule";
	}
	
	@GetMapping(value = "/ajouterVehicule")
	public String ajouterVehiculeGet(Model model) {
		return "ajouterVehicule";
	}
	@PostMapping(value = "/ajouterVehicule")
	public String ajouterVehiculePost(@Valid @ModelAttribute VehiculeForm vehiculeForm, Model model) {
		return null;
	}
	
	@GetMapping(value = "/modifierVehicule/{id}")
	public String modifiervehiculeGet(@PathVariable Integer id, Model model) {
		return "modifierVehicule";
	}
	@PostMapping(value = "/modifierVehicule")
	public String modifierClientPost(@Valid @ModelAttribute VehiculeForm vehiculeForm, BindingResult bindingResult) {
		return null;
	}
}
