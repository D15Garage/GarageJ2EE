package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.FicheEntretien;

public interface FicheEntretienDAO extends JpaRepository<FicheEntretien, Long> {

}
