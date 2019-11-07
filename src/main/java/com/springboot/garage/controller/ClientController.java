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
import com.springboot.garage.enums.Civilite;
import com.springboot.garage.model.Client;
import com.springboot.garage.services.IServiceListeClients;

@Controller
public class ClientController {

	@Autowired
	IServiceListeClients clientService;
	
	@GetMapping(value = "/afficherClients")
	public String afficherClients(Model model) {
		model.addAttribute("listeClients", clientService.afficherClients());
		return "afficherClients";
	}

	@GetMapping(value = "/ajouterClient")
	public String ajouterClientGet(Model model) {
		model.addAttribute("clientForm", new ClientForm());
		model.addAttribute("listeClients", clientService.afficherClients());
		return "ajouterClient";
	}
	@PostMapping(value = "/ajouterClient")
	public String ajouterClientPost(@Valid @ModelAttribute ClientForm clientForm, Model model) {
		Client c = new Client();
		c.setCivility(Civilite.valueOf(clientForm.getCivility()));
		c.setNom(clientForm.getNom());
		c.setPrenom(clientForm.getPrenom());
		c.setAdresse(clientForm.getAdresse());
		c.setCodePostal(clientForm.getCodePostal());
		c.setVille(clientForm.getVille());
		c.setTelephone(clientForm.getTelephone());
		clientService.ajouterClient(c);
		return null;
	}

	@GetMapping(value = "/modifierClient/{id}")
	public String modifierClientGet(@PathVariable Integer id, Model model) {
		Client c = clientService.trouverClient(id);
		ClientForm clientForm = new ClientForm();
		
		model.addAttribute("clientForm", clientForm);
		return "modifierClient";
	}
	@PostMapping(value = "/modifierClient")
	public String modifierClientPost(@Valid @ModelAttribute ClientForm clientForm, BindingResult bindingResult) {
		
		return null;
	}

}
