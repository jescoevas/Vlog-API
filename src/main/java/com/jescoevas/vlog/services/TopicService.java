package com.jescoevas.vlog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jescoevas.vlog.domain.Topic;
import com.jescoevas.vlog.repositories.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAll(){
		return (List<Topic>) this.topicRepository.findAll();
	}
	
	public Topic getTopic(String name) {
		Optional<Topic> topic = this.topicRepository.findById(name);
		return topic.isPresent() ? topic.get() : null;
	}
	
	public Topic create(Topic topic) {
		return this.topicRepository.save(topic);
	}
	
	public Topic update(Topic topic) {
		Optional<Topic> opt = this.topicRepository.findById(topic.getName());
		if(opt.isPresent()) {
			Topic topicDB = opt.get();
			topicDB.setName(topic.getName());
			return this.topicRepository.save(topicDB);
		}else {
			return null;
		}
	}
	
}
