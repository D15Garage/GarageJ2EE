package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.EmployeForm;
import com.springboot.garage.controller.form.PieceForm;
import com.springboot.garage.model.Piece;
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
	@PostMapping(value = "/ajouterPiece")
	public String ajouterPiecePost(@ModelAttribute PieceForm pieceForm, Model model) {
		Piece p = new Piece();
		p.setDescription(pieceForm.getDescription());
		//p.setQuantity(Integer.valueOf(pieceForm.getQuantity()));
		//p.setPrix(prix);
		pieceService.ajouterPiece(p);
		return null;
	}
	//HERE
	@GetMapping(value = "/modifierPiece")
	public String modifierPieceGet(Model model) {
		
		return "modifierPiece";
	}
	@PostMapping(value = "/modifierPiece")
	public String modifierPiecePost(@ModelAttribute EmployeForm employeForm, @ModelAttribute Integer employeeModId, Model model) {
		
		return null;
	}
}
