package com.klef.labexam.service;

import java.util.List;

import com.klef.labexam.model.User;

public interface UserService {

	public String add(User u);
	public List<User> viewall();
	public String deleteById(int id);
	
}
