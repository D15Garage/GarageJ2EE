package com.springboot.garage.controller;

import java.time.LocalDate;
import java.util.Date;

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
import com.springboot.garage.controller.form.PieceForm;
import com.springboot.garage.enums.EtatPiece;
import com.springboot.garage.model.Piece;
import com.springboot.garage.services.IServiceListePieces;

@Controller
public class PieceController {

	@Autowired
	IServiceListePieces pieceService;
	
	@GetMapping(value = "/afficherPiece")
	public String afficherPieces(Model model) {
		model.addAttribute("listePieces", pieceService.afficherPieces());
		return "piece/afficherPiece";
	}
	
	@GetMapping(value = "/ajouterPiece")
	public String ajouterPieceGet(Model model) {
		model.addAttribute("pieceForm", new PieceForm());
		return "piece/ajouterPiece";
	}
	
	@GetMapping(value = "/detailPiece/{id}")
	public String detailPiece(@PathVariable final Integer id, Model model) {
		Piece piece = pieceService.trouverPiece(id);
		model.addAttribute("piece", piece);
		if(model.containsAttribute("pieceForm") == false) {
			PieceForm pieceForm = new PieceForm();
			pieceForm.setId(piece.getId());
			pieceForm.setReference(piece.getReference());
			pieceForm.setQuantite(piece.getQuantite().toString());
			pieceForm.setPrixUnitaireHt(piece.getPrixUnitaireHt().toString());
			pieceForm.setDescription(piece.getDescription());
			
			model.addAttribute("pieceForm", pieceForm);
		}
		return "piece/detailPiece";
	}
	
	
	
	@PostMapping(value = "/ajouterPiece")
	public String ajouterPiecePost(@ModelAttribute PieceForm pieceForm, BindingResult presult, Model model) {
		if(!presult.hasErrors()) {
			Piece piece = new Piece();
			piece.setReference(pieceForm.getReference());
			piece.setQuantite(Integer.valueOf(pieceForm.getQuantite()));
			piece.setPrixUnitaireHt(Double.valueOf(pieceForm.getPrixUnitaireHt()));
			piece.setDescription(pieceForm.getDescription());
			if(piece.getQuantite() > 0) {
				piece.setStatut(EtatPiece.Disponible);
			} else {
				piece.setStatut(EtatPiece.Non_disponible);
			}
			piece.setDateSaisieStock(new Date());
			pieceService.ajouterPiece(piece);
		}
		model.addAttribute("listePieces", pieceService.afficherPieces());
		return "piece/afficherPiece";
	}

	@PostMapping("/modifierPiece")
	public String modifierPiece( 
			@Valid @ModelAttribute PieceForm pieceForm,
			BindingResult presult,Model model)
	{
		if(!presult.hasErrors()) {
			Piece piece = pieceService.trouverPiece(pieceForm.getId());
			Integer qtPiece = Integer.parseInt(pieceForm.getQuantite());
			if(qtPiece > 0) {
				piece.setStatut(EtatPiece.Disponible);
			} else {
				piece.setStatut(EtatPiece.Non_disponible);
			}
			piece.setPrixUnitaireHt(Double.valueOf(pieceForm.getPrixUnitaireHt()));
			piece.setQuantite(qtPiece);
			piece.setReference(pieceForm.getReference());
			piece.setDescription(pieceForm.getDescription());
			piece.setDateSaisieStock(new Date());
			pieceService.modifierPiece(piece);
			
			model.addAttribute("listePieces", pieceService.afficherPieces());
			return "piece/afficherPiece";
		}
		return "piece/afficherPiece";
	}
}
