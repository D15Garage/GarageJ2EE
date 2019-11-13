package com.springboot.garage.security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.garage.security.dao.AssociationDAO;
import com.springboot.garage.security.dao.UserDAO;
import com.springboot.garage.security.model.Association;
import com.springboot.garage.security.model.MyUserDetails;
import com.springboot.garage.security.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserDAO userDAO;
	@Autowired
	AssociationDAO associationDAO;
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userDAO.findByUsername(username);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));

        List<Association> associations = associationDAO.findByUser(user.get());
        List<String> nomRoles = new ArrayList<String>();
        for (Association a : associations) {
        	nomRoles.add(a.getRole().getNom());
        }
        return new MyUserDetails(user.get(), nomRoles);
	}
}
