package com.springboot.garage.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.security.model.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
