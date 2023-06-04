package com.jescoevas.vlog.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jescoevas.vlog.domain.Favourite;

@Repository
public interface FavouriteRepository extends CrudRepository<Favourite, Integer>{

}
