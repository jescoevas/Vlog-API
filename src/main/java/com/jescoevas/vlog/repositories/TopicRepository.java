package com.jescoevas.vlog.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jescoevas.vlog.domain.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{

}
