package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.EmployeeForm;
import com.springboot.garage.controller.form.PieceForm;
import com.springboot.garage.services.IServiceListePieces;

@Controller
public class PieceController {

	@Autowired
	IServiceListePieces pieceService;
	
	@GetMapping(value = "/afficherPieces")
	public String afficherPieces(Model model) {
		model.addAttribute("listePieces", pieceService.afficherPieces());
		return "afficherPieces";
	}
	
	@GetMapping(value = "/ajouterPiece")
	public String ajouterPieceGet(Model model) {
		model.addAttribute("pieceForm", new PieceForm());
		model.addAttribute("listePiece", pieceService.afficherPieces());
		return "ajouterPiece";
	}
	//Reprendre ICI
	@PostMapping(value = "/ajouterPiece")
	public String ajouterPiecePost(@ModelAttribute EmployeeForm employeeForm, Model model) {
		
		return null;
	}
	
	@GetMapping(value = "/modifierEmployee")
	public String modifierEmployeeGet(Model model) {
		
		return "modifierEmployee";
	}
	@PostMapping(value = "/modifierEmployee")
	public String modifierEmployeePost(@ModelAttribute EmployeeForm employeeForm, @ModelAttribute Long employeeModId, Model model) {
		
		return null;
	}
}
