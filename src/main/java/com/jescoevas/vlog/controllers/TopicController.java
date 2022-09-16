package com.jescoevas.vlog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public List<Topic> getAll(){
		return topicService.getAll();
	}
	
	@GetMapping("/{name}")
	public Topic getByName(@PathVariable String name) {
		return topicService.getByName(name);
	}
	
	@PostMapping
	public Topic save(@RequestBody Topic topic) {
		return topicService.save(topic);
	}
	
	@PutMapping("/{name}")
	public Topic update(@PathVariable String name, @RequestBody Topic topic) {
		return topicService.update(name, topic);
	}
	
	@DeleteMapping("/{name}")
	public String delete(@PathVariable String name) {
		return topicService.delete(name);
	}
}
