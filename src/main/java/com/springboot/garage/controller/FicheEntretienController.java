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

import com.springboot.garage.controller.form.FicheEntretienForm;
import com.springboot.garage.services.IServiceListeFiches;

@Controller
public class FicheEntretienController {
	
	@Autowired
	IServiceListeFiches ficheService;
	
	@GetMapping(value = "/afficherFiches")
	public String afficherFiche(Model model) {
		model.addAttribute("listeFiche", ficheService.afficherFiches());
		return "afficherFiches";
	}
	
	@GetMapping(value = "/ajouterFiches")
	public String ajouterFicheGet(Model model) {
		return "ajouterFiche";
	}
	@PostMapping(value = "/ajouterFiche")
	public String ajouterFichePost(@Valid @ModelAttribute FicheEntretienForm ficheForm, Model model) {
		return null;
	}
	
	@GetMapping(value = "/modifierFiche/{id}")
	public String modifierFicheGet(@PathVariable Integer id, Model model) {
		return "modifierFiche";
	}
	@PostMapping(value = "/modifierFiche")
	public String modifierFichePost(@Valid @ModelAttribute FicheEntretienForm ficheForm, BindingResult bindingResult) {
		return null;
	}
}
