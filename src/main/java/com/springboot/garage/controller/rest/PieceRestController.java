package com.springboot.garage.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.garage.model.Piece;
import com.springboot.garage.services.IServiceListePieces;

@RestController
@CrossOrigin
public class PieceRestController {

	@Autowired
	IServiceListePieces piecesService;
	
	@GetMapping(value = "/rest/Pieces")
	public List<Piece> pieces() {
		return piecesService.afficherPieces();
	}
}
