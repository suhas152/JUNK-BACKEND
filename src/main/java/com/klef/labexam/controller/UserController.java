package com.klef.labexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.labexam.model.User;
import com.klef.labexam.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/displayall")
	public List<User> displayall() {
		return service.viewall();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody User u) {
		return service.add(u);
	}
	
	@DeleteMapping("/delete/{id}")
	public String remove(@RequestParam int id) {
		return service.deleteById(id);
	}
	
}
