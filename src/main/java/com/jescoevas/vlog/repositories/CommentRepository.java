package com.jescoevas.vlog.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jescoevas.vlog.domain.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer>{

}
