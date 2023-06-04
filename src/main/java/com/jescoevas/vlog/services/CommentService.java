package com.jescoevas.vlog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jescoevas.vlog.domain.Comment;
import com.jescoevas.vlog.repositories.CommentRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	public Comment create(Comment comment) {
		return this.commentRepository.save(comment);
	}
	
}
