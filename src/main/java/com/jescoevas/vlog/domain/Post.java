package com.jescoevas.vlog.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "posts")
public class Post implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String body;
	@Column(name = "creation_date")
	private LocalDateTime creationDate;
	@ManyToOne
//	@JoinColumn(name = "post_user")
	private User user;
	@ManyToOne
//	@JoinColumn(name = "post_topic")
	private Topic topic;
	
	public Post() {}
	
	public Post(String title, String body, User user, Topic topic) {
		this.title = title;
		this.body = body;
		this.creationDate = LocalDateTime.now();
		this.user = user;
		this.topic = topic;
	}
	
	public Post(String title, String body, LocalDateTime creationDate, User user, Topic topic) {
		this.title = title;
		this.body = body;
		this.creationDate = creationDate;
		this.user = user;
		this.topic = topic;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
