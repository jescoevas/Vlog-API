package com.jescoevas.vlog.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jescoevas.vlog.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer>{

}
