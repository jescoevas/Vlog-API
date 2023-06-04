package com.jescoevas.vlog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jescoevas.vlog.domain.Topic;
import com.jescoevas.vlog.services.TopicService;

@RestController
@RequestMapping("/topic")
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@GetMapping
	public ResponseEntity<List<Topic>> getAll() {
		System.out.println("Entrando en: TopicController.getAll()");
		List<Topic> all = this.topicService.getAll();
		ResponseEntity<List<Topic>> res = new ResponseEntity<List<Topic>>(all, HttpStatus.OK);
		return res;
	}
	
	@GetMapping("/{name}")
	public Topic getTopic(@PathVariable String name) {
		System.out.println("Entrando en: TopicController.getTopic()");
		System.out.println("Parámetro name: " + name);
		return this.topicService.getTopic(name);
	}
	
	@PostMapping
	public Topic create(@RequestBody Topic topic) {
		return this.topicService.create(topic);
	}
	
	@PutMapping("/{name}")
	public Topic update(@RequestBody Topic topic, @PathVariable String name) {
		return this.topicService.update(topic);
	}
	
}
