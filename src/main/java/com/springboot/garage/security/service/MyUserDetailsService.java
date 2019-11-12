package com.springboot.garage.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.garage.security.dao.UserDAO;
import com.springboot.garage.security.model.MyUserDetails;
import com.springboot.garage.security.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserDAO userDAO;
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userDAO.findByUsername(username);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));

        return user.map(MyUserDetails::new).get();
	}
}
