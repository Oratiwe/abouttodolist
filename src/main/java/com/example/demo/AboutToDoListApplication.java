package com.example.demo;

import com.example.demo.entity.AboutToDo;
import com.example.demo.entity.User;
import com.example.demo.repository.AboutToDoRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class AboutToDoListApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
//	@Autowired
//	private AboutToDoRepository aboutToDoRepository;
	@Autowired
	private  AboutToDoRepository aboutToDoRepository;



	public static void main(String[] args) {
		SpringApplication.run(AboutToDoListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Code to execute after the application starts

		User user =new User();
		user.setId(1L);
		user.setPassword("should be hashed");
		user.setUsername("Emily");

	AboutToDo aboutToDo =new AboutToDo();
	aboutToDo.setId(1L);
	aboutToDo.setContent("Upload video to YT");

	user.getAboutToDolist();

	aboutToDoRepository.save(aboutToDo);

	aboutToDoRepository.save(aboutToDo);


	}
}
