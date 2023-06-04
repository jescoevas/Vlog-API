package com.jescoevas.vlog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jescoevas.vlog.domain.Favourite;
import com.jescoevas.vlog.repositories.FavouriteRepository;

@Service
public class FavouriteService {

	@Autowired
	private FavouriteRepository favouriteRepository;
	
	public Favourite create(Favourite favourite) {
		return this.favouriteRepository.save(favourite);
	}
	
}
