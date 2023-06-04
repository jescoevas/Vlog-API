package com.jescoevas.vlog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jescoevas.vlog.domain.User;
import com.jescoevas.vlog.repositories.UserRepository;

@Service
public class UserService{

	@Autowired
	private UserRepository userRepository;
	
	public User create(User user) {
		return this.userRepository.save(user);
	}
	
}
