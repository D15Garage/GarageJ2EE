package com.springboot.garage.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employe")
public class User {

	@Id
	@Column(name="idemploye")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(name="numeroEmploye")
    private String username;
    
    @Column(name="motDePasse")
    private String password;
    
    transient private String roles = "ROLE";
    
    public String getUsername() {
    	return username;
    }
    public String getPassword() {
    	return password;
    }
	
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
