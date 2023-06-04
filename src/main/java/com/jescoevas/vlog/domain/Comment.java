package com.jescoevas.vlog.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "comments")
public class Comment implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String body;
	@Column(name = "creation_date")
	private LocalDateTime creationDate;
	private Boolean banned;
	@ManyToOne
	private Post post;
	@ManyToOne
	private User user;
	
	public Comment() {}
	
	public Comment(String body, Post post, User user) {
		this.body = body;
		this.creationDate = LocalDateTime.now();
		this.banned = false;
		this.post = post;
		this.user = user;
	}
	
	public Comment(String body, LocalDateTime creationDate, Boolean banned, Post post, User user) {
		this.body = body;
		this.creationDate = creationDate;
		this.banned = banned;
		this.post = post;
		this.user = user;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public Boolean getBanned() {
		return banned;
	}
	public void setBanned(Boolean banned) {
		this.banned = banned;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
