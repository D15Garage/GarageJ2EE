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

import com.springboot.garage.controller.form.EmployeeForm;
import com.springboot.garage.enums.Civility;
import com.springboot.garage.model.Employee;
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
	public String ajouterEmployeePost(@Valid @ModelAttribute EmployeeForm employeeForm, BindingResult bindingResult) {
		Employee e = new Employee();
		e.setCivility(Civility.valueOf(employeeForm.getCivility()));
		e.setNom(employeeForm.getNom());
		e.setPrenom(employeeForm.getPrenom());
		e.setIdentifiant(employeeForm.getIdentifiant());
		e.setMotDePasse(employeeForm.getMotDePasse());
		employeeService.ajouterEmployee(e);
		return null;
	}
	
	@GetMapping(value = "/modifierEmployee/{id}")
	public String modifierEmployeeGet(@PathVariable final Integer id, Model model) {
		Employee e = employeeService.trouverEmployee(id);
		EmployeeForm employeeForm = new EmployeeForm();
		employeeForm.setCivility(e.getCivility().toString());
		employeeForm.setNom(e.getNom());
		employeeForm.setPrenom(e.getPrenom());
		employeeForm.setIdentifiant(e.getIdentifiant());
		employeeForm.setMotDePasse(e.getMotDePasse());
		model.addAttribute("employeeForm", employeeForm);
		return "modifierEmployee";
	}
	@PostMapping(value = "/modifierEmployee")
	public String modifierEmployeePost(@Valid @ModelAttribute EmployeeForm employeeForm, BindingResult bindingResult, @ModelAttribute Integer employeeModId) {
		//Here
		return null;
	}
	
}
