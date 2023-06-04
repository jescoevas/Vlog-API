package com.jescoevas.vlog.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topics")
public class Topic implements Serializable{

	@Id
	private String name;
	
	public Topic() {}
	
	public Topic(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
