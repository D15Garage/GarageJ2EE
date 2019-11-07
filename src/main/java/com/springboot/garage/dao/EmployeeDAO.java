package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.Employe;

public interface EmployeeDAO extends JpaRepository<Employe, Long> {

}
