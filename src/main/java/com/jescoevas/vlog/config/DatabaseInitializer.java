package com.jescoevas.vlog.config;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jescoevas.vlog.domain.Comment;
import com.jescoevas.vlog.domain.Favourite;
import com.jescoevas.vlog.domain.Post;
import com.jescoevas.vlog.domain.Topic;
import com.jescoevas.vlog.domain.User;
import com.jescoevas.vlog.services.CommentService;
import com.jescoevas.vlog.services.FavouriteService;
import com.jescoevas.vlog.services.PostService;
import com.jescoevas.vlog.services.TopicService;
import com.jescoevas.vlog.services.UserService;

@Component
public class DatabaseInitializer implements CommandLineRunner{

	@Autowired
	private TopicService topicService;
	@Autowired
	private UserService userService;
	@Autowired
	private PostService postService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private FavouriteService favouriteService;
	
	@Override
	public void run(String... args) throws Exception {
		Topic t1 = new Topic("Sports");
		Topic t2 = new Topic("Politics");
		Topic t3 = new Topic("Movies");
		Topic t4 = new Topic("Technology");
		Topic t5 = new Topic("Videogames");
		
		t1 = topicService.create(t1);
		t2 = topicService.create(t2);
		t3 = topicService.create(t3);
		t4 = topicService.create(t4);
		t5 = topicService.create(t5);
		
		User u1 = new User("Estoico", LocalDate.of(1997, 3, 21), "Sevilla", true);
		User u2 = new User("LaMartita", LocalDate.of(1997, 4, 30), "Sevilla", false);
		
		
		u1 = userService.create(u1);
		u2 = userService.create(u2);
		
		Post p1 = new Post("The shawshank redemption", "Best movie i've ever seen.", u1, t3);
		Post p2 = new Post("About ChatGPT", "This is crazy. Maybe the best tool right now.", u1, t4);
		Post p3 = new Post("I love playing Sims4!", "Cant wait EA to release Sims5!.", u2, t5);
		
		p1 = postService.create(p1);
		p2 = postService.create(p2);
		p3 = postService.create(p3);
		
		Comment c1 = new Comment("Great post", p1, u2);
		
		c1 = commentService.create(c1);
		
		Favourite f1 = new Favourite(p1,u2);
		
		f1 = favouriteService.create(f1);
		
	}
	
}
