package com.jescoevas.vlog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jescoevas.vlog.domain.Topic;
import com.jescoevas.vlog.repositories.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public Topic getByName(String name) {
		Topic topic = topicRepository.getByName(name);
		return topic;
	}
	
	public List<Topic> getAll(){
		return (List<Topic>) topicRepository.findAll();
	}
	
	public Topic save(Topic topic) {
		return topicRepository.save(topic);
	}
	
	public Topic update(String name, Topic topic) {
		Topic topicDB = getByName(name);
		if(topicDB == null) {
			return null;
		}
		topicDB.setName(topic.getName());
		return save(topicDB);
	}
	
	public String delete(String name) {
		Topic topic = getByName(name);
		if(topic != null) {
			topicRepository.delete(topic);
			return "Succesfully deleted";
		}
		return "Topic named " + name + " was not found";
	}
	
}
