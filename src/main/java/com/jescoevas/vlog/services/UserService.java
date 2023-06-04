package com.jescoevas.vlog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jescoevas.vlog.domain.User;
import com.jescoevas.vlog.repositories.UserRepository;

@Service
public class UserService{

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAll(){
		return (List<User>) this.userRepository.findAll();
	}
	
	public User getById(Integer id) {
		Optional<User> opt = this.userRepository.findById(id);
		return opt.isPresent() ? opt.get() : null;
	}
	
	@Transactional
	public User create(User user) {
		return this.userRepository.save(user);
	}
	
}
