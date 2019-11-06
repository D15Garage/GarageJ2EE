package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.TacheForm;
import com.springboot.garage.model.Tache;
import com.springboot.garage.services.IServiceListeTaches;

@Controller
public class TacheController {

	@Autowired
	IServiceListeTaches tacheService;
	
	@GetMapping(value = "/afficherTaches")
	public String afficherTache(Model model) {
		model.addAttribute("listeTaches", tacheService.afficherTaches());
		return "afficherTaches";
	}
	
	@GetMapping(value = "/ajouterTache")
	public String ajouterTacheGet(Model model) {
		model.addAttribute("tacheForm", new TacheForm());
		model.addAttribute("listeTaches", tacheService.afficherTaches());
		return "ajouterTache";
	}
	@PostMapping(value = "/ajouterTache")
	public String ajouterTachePost(@ModelAttribute TacheForm tacheForm, Model model) {
		Tache t = new Tache();
		
		tacheService.ajouterTache(t);
		return null;
	}
	
	@GetMapping(value = "/modifierTache")
	public String modifierTacheGet(Model model) {
		model.addAttribute("tacheForm", new TacheForm());
		model.addAttribute("tacheModId", new Long(0));
		model.addAttribute("listeTache", tacheService.afficherTaches());
		return "modifierTache";
	}
	@PostMapping(value = "/modifierTache")
	public String modifierTachePost(@ModelAttribute TacheForm tacheForm, @ModelAttribute Integer tacheModId, Model model) {
		Tache t = tacheService.trouverTache(tacheModId);
		
		tacheService.modifierTache(t);
		return null;
	}
	
}
