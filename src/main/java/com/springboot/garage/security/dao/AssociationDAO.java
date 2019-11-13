package com.springboot.garage.security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.security.model.Association;
import com.springboot.garage.security.model.User;

public interface AssociationDAO extends JpaRepository<Association, Integer> {

	List<Association> findByUser(User user);
}
