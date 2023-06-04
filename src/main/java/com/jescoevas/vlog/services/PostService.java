package com.jescoevas.vlog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jescoevas.vlog.domain.Post;
import com.jescoevas.vlog.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post create(Post post) {
		return this.postRepository.save(post);
	}
	
}
