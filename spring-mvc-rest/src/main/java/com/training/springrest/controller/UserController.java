package com.training.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.springrest.model.User;
import com.training.springrest.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@RequestMapping("/users")
	@ResponseBody
	public List<User> getUsers(){
		System.out.println("Getting users::::");
		List<User> users = repository.findAll();
		return users;
	}
	
	
	  @RequestMapping(value = "/addUsers", method = RequestMethod.POST) 
	  public ResponseEntity<Void> addPersons(@RequestBody User user) {
	  
		  System.out.println("Adding new users::"); 
		  repository.save(user); 
		  return new ResponseEntity<Void>(HttpStatus.CREATED);
	  
	  }

}
