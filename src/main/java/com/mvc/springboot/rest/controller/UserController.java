package com.mvc.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mvc.springboot.rest.model.User;
import com.mvc.springboot.rest.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	public UserRepository userRepo;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}

}
