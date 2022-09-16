package com.jescoevas.vlog.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "favourites")
@IdClass(FavouriteId.class)
public class Favourite implements Serializable {

	@Id
	@JoinColumn(name = "user_id")
	private Integer user;
	@Id
	@JoinColumn(name = "post_id")
	private Integer post;
	
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
