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

// import com.springboot.garage.controller.form.FactureEntretienForm;
import com.springboot.garage.services.IServiceListeFactureEntretien;

@Controller
public class FactureEntretienController {

	@Autowired
	IServiceListeFactureEntretien factureEntretienService;
	
	@GetMapping(value = "/afficherFacturesEntretien")
	public String afficherFactureEntretien(Model model) {
		model.addAttribute("listeDevis", factureEntretienService.afficherfactures());
		return "afficherFacturesEntretien";
	}
	
	@GetMapping(value = "/ajouterFactureEntretien")
	public String ajouterFactureEntretienGet(Model model) {
		return "ajouterFactureEntretien";
	}
//	@PostMapping(value = "/ajouterFactureEntretien")
//	public String ajouterFactureEntretienPost(@Valid @ModelAttribute FactureEntretienForm factureEntretienForm, Model model) {
//		return null;
//	}
	
	@GetMapping(value = "/modifierFactureEntretien/{id}")
	public String modifierFactureEntretienGet(@PathVariable Integer id, Model model) {
		return "modifierFactureEntretien";
	}
//	@PostMapping(value = "/modifierFactureEntretien")
//	public String modifierFactureEntretienPost(@Valid @ModelAttribute FactureEntretienForm factureEntretienForm, BindingResult bindingResult) {
//		return null;
//	}
}
