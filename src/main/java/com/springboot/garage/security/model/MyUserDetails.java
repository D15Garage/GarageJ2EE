package com.springboot.garage.security.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

    private String username;

    private String password;
    
	private List<GrantedAuthority> authorities;

	public MyUserDetails(User user, List<String> nomRoles) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		
		String r[] = new String[nomRoles.size()];
		nomRoles.toArray(r);
		this.authorities = Arrays.stream(r)
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
		for (GrantedAuthority g : this.authorities)
			System.out.println(g);
		//user.getRoles().split(",")//nomRoles.toArray()
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
