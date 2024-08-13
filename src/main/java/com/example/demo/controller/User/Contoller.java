package com.example.demo.controller.User;

import com.example.demo.repository.AboutToDoRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Contoller {

  private   UserRepository userRepository;
  private   AboutToDoRepository aboutToDoRepository;

  public UserController(UserRepository)
}
