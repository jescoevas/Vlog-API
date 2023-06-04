package com.jescoevas.vlog.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jescoevas.vlog.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
