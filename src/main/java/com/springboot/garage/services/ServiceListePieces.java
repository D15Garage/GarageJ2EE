package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.PieceDAO;
import com.springboot.garage.model.Piece;

@Service
public class ServiceListePieces implements IServiceListePieces {

	@Autowired
	PieceDAO pieceDAO;

	@Override
	public List<Piece> afficherPieces() {
		return pieceDAO.findAll();
	}

	@Override
	public Piece trouverPiece(Integer idPiece) {
		List<Piece> pieces = pieceDAO.findAll();
		for (Piece p : pieces) {
			if (p.getId() == idPiece) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void ajouterPiece(Piece piece) {
		pieceDAO.save(piece);
	}

	@Override
	public void modifierPiece(Piece piece) {
		pieceDAO.save(piece);
	}
}
