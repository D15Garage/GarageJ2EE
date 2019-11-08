package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.CommandeClientVehicule;

public interface CommandeClientVehiculeDAO extends JpaRepository<CommandeClientVehicule, Long> {

}
