package com.jescoevas.vlog.domain;

import java.io.Serializable;

public class FavouriteId implements Serializable {

	private Integer user;
	private Integer post;
	
	public FavouriteId(Integer user, Integer post) {
		super();
		this.user = user;
		this.post = post;
	}
	
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public Integer getPost() {
		return post;
	}
	public void setPost(Integer post) {
		this.post = post;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
