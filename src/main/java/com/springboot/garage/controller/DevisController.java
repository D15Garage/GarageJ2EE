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

import com.springboot.garage.controller.form.ClientForm;
import com.springboot.garage.controller.form.DevisForm;
import com.springboot.garage.services.IServiceListeDevis;

@Controller
public class DevisController {

	@Autowired
	IServiceListeDevis devisService;
	
	@GetMapping(value = "/afficherDevis")
	public String afficherDevis(Model model) {
		model.addAttribute("listeDevis", devisService.afficherDevis());
		return "afficherDevis";
	}
	
	@GetMapping(value = "/ajouterDevis")
	public String ajouterDevisGet(Model model) {
		model.addAttribute("devisForm", new ClientForm());
		model.addAttribute("listeDevis", devisService.afficherDevis());
		return "ajouterDevis";
	}
	@PostMapping(value = "/ajouterDevis")
	public String ajouterDevisPost(@Valid @ModelAttribute DevisForm devisForm, Model model) {
		return null;
	}
	
	@GetMapping(value = "/modifierDevis/{id}")
	public String modifierDevisGet(@PathVariable Integer id, Model model) {
		return "modifierDevis";
	}
	@PostMapping(value = "/modifierDevis")
	public String modifierDevisPost(@Valid @ModelAttribute DevisForm devisForm, BindingResult bindingResult) {
		return null;
	}
}
