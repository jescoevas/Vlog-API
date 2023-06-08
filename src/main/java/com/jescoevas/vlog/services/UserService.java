package com.jescoevas.vlog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jescoevas.vlog.domain.User;
import com.jescoevas.vlog.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	private BCryptPasswordEncoder passwordEncoder;
	
	public List<User> getAll(){
		return (List<User>) this.userRepository.findAll();
	}
	
	public User getById(Integer id) {
		Optional<User> opt = this.userRepository.findById(id);
		return opt.isPresent() ? opt.get() : null;
	}
	
	public User getByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}
	
	@Transactional
	public User create(User user) {
		passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setAdmin(false);
		return this.userRepository.save(user);
	}
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    User user = getByUsername(username);
	    if (user == null) {
	        throw new UsernameNotFoundException("Usuario no encontrado: " + username);
	    }
	    List<GrantedAuthority> authorities = new ArrayList<>();
	    if (user.getAdmin()) {
	        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
	    } else {
	        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
	    }
	    return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
	}
	
}
