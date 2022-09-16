package com.jescoevas.vlog.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jescoevas.vlog.domain.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer>{

	@Query("SELECT t from Topic t where t.name = ?1")
	Topic getByName(String name);
	
}
