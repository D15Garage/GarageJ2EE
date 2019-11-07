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

import com.springboot.garage.controller.form.EmployeForm;
import com.springboot.garage.enums.Civilite;
import com.springboot.garage.model.Employe;
import com.springboot.garage.services.IServiceListeEmploye;

@Controller
public class EmployeController {

	@Autowired
	IServiceListeEmploye employeService;
	
	@GetMapping(value = "/afficherEmployes")
	public String afficherEmployes(Model model) {
		model.addAttribute("listeEmployes", employeService.afficherEmployes());
		return "afficherEmployes";
	}
	
	@GetMapping(value = "/ajouterEmploye")
	public String ajouterEmployeGet(Model model) {
		model.addAttribute("employeForm", new EmployeForm());
		model.addAttribute("listeEmployes", employeService.afficherEmployes());
		return "ajouterEmploye";
	}
	@PostMapping(value = "/ajouterEmploye")

	public String ajouterEmployePost(@Valid @ModelAttribute EmployeForm employeForm, BindingResult bindingResult) {
		Employe e = new Employe();
		e.setCivilite(Civilite.valueOf(employeForm.getCivilite()));
		e.setNom(employeForm.getNom());
		e.setPrenom(employeForm.getPrenom());
		e.setNumeroEmploye(employeForm.getIdentifiant());
		e.setMotDePasse(employeForm.getMotDePasse());
		employeService.ajouterEmploye(e);
		return null;
	}
	
	@GetMapping(value = "/modifierEmploye/{id}")
	public String modifierEmployeGet(@PathVariable final Integer id, Model model) {
		Employe e = employeService.trouverEmploye(id);
		EmployeForm employeForm = new EmployeForm();
		employeForm.setCivilite(e.getCivilite().toString());
		employeForm.setNom(e.getNom());
		employeForm.setPrenom(e.getPrenom());
		employeForm.setIdentifiant(e.getNumeroEmploye());
		employeForm.setMotDePasse(e.getMotDePasse());
		model.addAttribute("employeForm", employeForm);
		return "modifierEmploye";
	}
	@PostMapping(value = "/modifierEmploye")
	public String modifierEmployePost(@Valid @ModelAttribute EmployeForm employeForm, BindingResult bindingResult, @ModelAttribute Integer employeModId) {
		//Here
		Employe e = employeService.trouverEmploye(employeModId);
		e.setCivilite(Civilite.valueOf(employeForm.getCivilite()));
		e.setNom(employeForm.getNom());
		e.setPrenom(employeForm.getPrenom());
		e.setNumeroEmploye(employeForm.getIdentifiant());
		e.setMotDePasse(employeForm.getMotDePasse());
		//e.setRoles(employeForm.getRoles());
		employeService.modifierEmploye(e);
		return null;
	}
	
}
