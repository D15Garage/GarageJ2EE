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
import com.springboot.garage.model.Employe;
import com.springboot.garage.services.IServiceListeEmploye;

@Controller
public class EmployeeController {

	@Autowired
	IServiceListeEmploye employeeService;
	
	@GetMapping(value = "/afficherEmployees")
	public String afficherEmployees(Model model) {
		model.addAttribute("listeEmployees", employeeService.afficherEmployes());
		return "afficherEmployees";
	}
	
	@GetMapping(value = "/ajouterEmployee")
	public String ajouterEmployeeGet(Model model) {
		model.addAttribute("employeeForm", new EmployeForm());
		model.addAttribute("listeEmployees", employeeService.afficherEmployes());
		return "ajouterEmployee";
	}
	@PostMapping(value = "/ajouterEmployee")

	public String ajouterEmployeePost(@Valid @ModelAttribute EmployeForm employeeForm, BindingResult bindingResult) {
		Employe e = new Employe();

		return null;
	}
	
	@GetMapping(value = "/modifierEmployee/{id}")
	public String modifierEmployeeGet(@PathVariable final Integer id, Model model) {
		Employe e = employeeService.trouverEmploye(id);
		EmployeForm employeeForm = new EmployeForm();

		model.addAttribute("employeeForm", employeeForm);
		return "modifierEmployee";
	}
	@PostMapping(value = "/modifierEmployee")
	public String modifierEmployeePost(@Valid @ModelAttribute EmployeForm employeeForm, BindingResult bindingResult, @ModelAttribute Integer employeeModId) {
		
		Employe e = employeeService.trouverEmploye(employeeModId);

		employeeService.modifierEmploye(e);
		return null;
	}
	
}
