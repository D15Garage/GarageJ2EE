package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.EmployeeForm;
import com.springboot.garage.enums.Civilite;
import com.springboot.garage.model.Employe;
import com.springboot.garage.services.IServiceListeEmployee;

@Controller
public class EmployeeController {

	@Autowired
	IServiceListeEmployee employeeService;
	
	@GetMapping(value = "/afficherEmployees")
	public String afficherEmployees(Model model) {
		model.addAttribute("listeEmployees", employeeService.afficherEmployees());
		return "afficherEmployees";
	}
	
	@GetMapping(value = "/ajouterEmployee")
	public String ajouterEmployeeGet(Model model) {
		model.addAttribute("employeeForm", new EmployeeForm());
		model.addAttribute("listeEmployees", employeeService.afficherEmployees());
		return "ajouterEmployee";
	}
	@PostMapping(value = "/ajouterEmployee")
	public String ajouterEmployeePost(@ModelAttribute EmployeeForm employeeForm, Model model) {
		Employe e = new Employe();
		e.setCivility(Civilite.valueOf(employeeForm.getCivility()));
		e.setNom(employeeForm.getNom());
		e.setPrenom(employeeForm.getPrenom());
		e.setIdentifiant(employeeForm.getIdentifiant());
		e.setMotDePasse(employeeForm.getMotDePasse());
		e.setRoles(employeeForm.getRoles());
		employeeService.ajouterEmployee(e);
		return null;
	}
	
	@GetMapping(value = "/modifierEmployee")
	public String modifierEmployeeGet(Model model) {
		model.addAttribute("employeeForm", new EmployeeForm());
		model.addAttribute("employeeModId", new Long(0));		
		model.addAttribute("listeEmployees", employeeService.afficherEmployees());
		return "modifierEmployee";
	}
	@PostMapping(value = "/modifierEmployee")
	public String modifierEmployeePost(@ModelAttribute EmployeeForm employeeForm, @ModelAttribute Long employeeModId, Model model) {
		Employe e = employeeService.trouverEmployee(employeeModId);
		e.setCivility(Civilite.valueOf(employeeForm.getCivility()));
		e.setNom(employeeForm.getNom());
		e.setPrenom(employeeForm.getPrenom());
		e.setIdentifiant(employeeForm.getIdentifiant());
		e.setMotDePasse(employeeForm.getMotDePasse());
		e.setRoles(employeeForm.getRoles());
		employeeService.modifierEmployee(e);
		return null;
	}
	
}
