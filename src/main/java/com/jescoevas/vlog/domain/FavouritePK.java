package com.jescoevas.vlog.domain;

import java.io.Serializable;
import java.util.Objects;

public class FavouritePK implements Serializable{
	
	private Integer post;
	private Integer user;
	
	public FavouritePK() { }
	
	public FavouritePK(Integer post, Integer user) {
		super();
		this.post = post;
		this.user = user;
	}

	public Integer getPost() {
		return post;
	}

	public void setPost(Integer post) {
		this.post = post;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(post, user);
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        FavouritePK other = (FavouritePK) obj;
        return Objects.equals(post, other.post) && Objects.equals(user, other.user);
    }



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
